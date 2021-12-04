package com.springboot.race.raceDemo.dtos;

import com.springboot.race.raceDemo.models.MatchOdds;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MatchOddsDetailsDto {

    private String specifier;
    private Double odd;

    public MatchOddsDetailsDto(MatchOdds matchOdds){
        this.specifier = matchOdds.getSpecifier();
        this.odd = matchOdds.getOdd();
    }

}
