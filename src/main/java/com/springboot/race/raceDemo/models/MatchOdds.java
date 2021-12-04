package com.springboot.race.raceDemo.models;

import lombok.*;

import javax.persistence.*;

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

}
