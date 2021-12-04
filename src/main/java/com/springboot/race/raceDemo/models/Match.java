package com.springboot.race.raceDemo.models;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Match {

    private Long id;
    private String description;
    private LocalDate matchDate;
    private LocalTime matchTime;
    private String teamA;
    private String teamB;
    private String sport;

}
