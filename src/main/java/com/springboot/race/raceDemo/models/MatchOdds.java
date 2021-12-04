package com.springboot.race.raceDemo.models;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MatchOdds {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Relations Below
    @OneToOne
    private Match match;

    private String specifier;
    private Double odd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchOdds matchOdds = (MatchOdds) o;
        return Objects.equals(id, matchOdds.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
