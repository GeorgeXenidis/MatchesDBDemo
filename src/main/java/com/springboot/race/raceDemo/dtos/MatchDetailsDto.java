package com.springboot.race.raceDemo.dtos;

import com.springboot.race.raceDemo.models.Match;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MatchDetailsDto {

    private Long id;
    private String description;
    private LocalDate matchDate;
    private LocalTime matchTime;
    private String teamA;
    private String teamB;
    private String sport;

    public MatchDetailsDto(Match match){
        this.id = match.getId();
        this.description = match.getDescription();
        this.matchDate = match.getMatchDate();
        this.matchTime = match.getMatchTime();
        this.teamA = match.getTeamA();
        this.teamB = match.getTeamB();
        this.sport = match.getSport();
    }

}
