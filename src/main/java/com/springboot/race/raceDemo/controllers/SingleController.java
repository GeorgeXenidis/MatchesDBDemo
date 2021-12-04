package com.springboot.race.raceDemo.controllers;

import com.springboot.race.raceDemo.repositories.MatchOddsRepository;
import com.springboot.race.raceDemo.repositories.MatchRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/match")
@Controller
public class SingleController {

    private final MatchRepository matchRepository;
    private final MatchOddsRepository matchOddsRepository;

    public SingleController(MatchRepository matchRepository, MatchOddsRepository matchOddsRepository) {
        this.matchRepository = matchRepository;
        this.matchOddsRepository = matchOddsRepository;
    }

    @GetMapping("/getMatchDetails")
    public void getMatchDetails(){
        
    }

    @PostMapping("/createMatch")
    public void createMatch(){

    }

    @PutMapping("/updateMatch")
    public void updateMatch(){

    }

    @PostMapping("/deleteMatch")
    public void deleteMatch(){

    }

}
