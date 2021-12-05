package com.springboot.race.raceDemo.dtos;

import com.springboot.race.raceDemo.models.Match;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MatchDetailsDto {

    private Long id;
    private String description;
    private String matchDate;
    private String matchTime;
    private String teamA;
    private String teamB;
    private String sport;

    public MatchDetailsDto(Match match){
        this.id = match.getId();
        this.description = match.getDescription();
        this.matchDate = match.getMatchDate().toString();
        this.matchTime = match.getMatchTime().toString();
        this.teamA = match.getTeamA();
        this.teamB = match.getTeamB();
        this.sport = match.getSport();
    }

}
