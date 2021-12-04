package com.springboot.race.raceDemo.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Relations Below
    @OneToOne(mappedBy = "match",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private MatchOdds matchOdds;

    private String description;
    private LocalDate matchDate;
    private LocalTime matchTime;
    private String teamA;
    private String teamB;
    private String sport;

}
