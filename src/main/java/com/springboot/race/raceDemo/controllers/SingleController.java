package com.springboot.race.raceDemo.controllers;

import com.springboot.race.raceDemo.dtos.IdDto;
import com.springboot.race.raceDemo.dtos.MatchDetailsDto;
import com.springboot.race.raceDemo.dtos.SportDto;
import com.springboot.race.raceDemo.models.Match;
import com.springboot.race.raceDemo.models.MatchOdds;
import com.springboot.race.raceDemo.models.Sport;
import com.springboot.race.raceDemo.repositories.MatchOddsRepository;
import com.springboot.race.raceDemo.repositories.MatchRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.modelmapper.ModelMapper;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;

@RequestMapping("/match")
@Controller
public class SingleController {

    private final MatchRepository matchRepository;
    private final MatchOddsRepository matchOddsRepository;
    private ModelMapper modelMapper;

    public SingleController(MatchRepository matchRepository, MatchOddsRepository matchOddsRepository, ModelMapper modelMapper) {
        this.matchRepository = matchRepository;
        this.matchOddsRepository = matchOddsRepository;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/getMatchDetails")
    @ResponseBody
    public MatchDetailsDto getMatchDetails(@RequestBody IdDto id){

        Optional<Match> optionalMatch = matchRepository.findById(id.getId());

        if(optionalMatch.isEmpty()){
            throw  new NoSuchElementException("The match with the given ID couldn't be found");
        }

        Match match = optionalMatch.get();
        MatchDetailsDto matchDetailsDto = new MatchDetailsDto(match);

        return matchDetailsDto;
    }


    @PostMapping("/createMatch")
    @ResponseBody
    public MatchDetailsDto createMatch(){
        Scanner input = new Scanner(System.in);
        Match match = Match.builder()
                .description("New Game Between Teams")
                .matchDate(LocalDate.EPOCH)
                .matchTime(LocalTime.MIDNIGHT)
                .teamA("A")
                .teamB("B")
                .sport(Sport.Basketball.name())
                .build();

        MatchOdds matchOdds = MatchOdds.builder()
                .specifier("Ω")
                .odd(3.1d)
                .build();

        match.setMatchOdds(matchOdds);
        matchOdds.setMatch(match);
        matchRepository.save(match);

        MatchDetailsDto matchDetailsDto = new MatchDetailsDto(match);

        return matchDetailsDto;
    }

    @PutMapping("/updateMatch")
    @ResponseBody
    public MatchDetailsDto updateMatch(@RequestBody SportDto newSport){

        Optional<Match> optionalMatch = matchRepository.findById(newSport.getId());
        if(optionalMatch.isEmpty()){
            throw  new NoSuchElementException("The match with the given ID couldn't be found");
        }

        Match match = optionalMatch.get();
        match.setSport(newSport.getSportType());
        matchRepository.save(match);

        MatchDetailsDto matchDetailsDto = new MatchDetailsDto(match);

        return matchDetailsDto;

    }

    @PostMapping("/deleteMatch")
    @ResponseBody
    public void deleteMatch(@RequestBody IdDto id){

        Optional<Match> optionalMatch = matchRepository.findById(id.getId());
        if(optionalMatch.isEmpty()){
            throw  new NoSuchElementException("The match with the given ID couldn't be found");
        }

        Match match = optionalMatch.get();
        matchRepository.delete(match);
    }

}
