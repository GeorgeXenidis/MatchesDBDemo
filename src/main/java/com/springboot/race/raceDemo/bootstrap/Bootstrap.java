package com.springboot.race.raceDemo.bootstrap;

import com.springboot.race.raceDemo.models.Match;
import com.springboot.race.raceDemo.models.MatchOdds;
import com.springboot.race.raceDemo.models.Sport;
import com.springboot.race.raceDemo.repositories.MatchOddsRepository;
import com.springboot.race.raceDemo.repositories.MatchRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Component
public class Bootstrap implements CommandLineRunner {

    private MatchRepository matchRepository;
    private MatchOddsRepository matchOddsRepository;

    public Bootstrap(MatchRepository matchRepository, MatchOddsRepository matchOddsRepository) {
        this.matchRepository = matchRepository;
        this.matchOddsRepository = matchOddsRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        initializeDatabaseData();

    }

    private void initializeDatabaseData() {

        Match match1, match2, match3;
        MatchOdds matchOdds1, matchOdds2, matchOdds3;

        match1 = Match.builder()
                .description("Some description goes here-><-")
                .matchDate(LocalDate.now())
                .matchTime(LocalTime.now())
                .teamA("Team_A")
                .teamB("Team_B")
                .sport(Sport.Volleyball.name())//Method "toString()" would have done same job here.
                .build();

        match2 = Match.builder()
                .description("Second description {}{}{}")
                .matchDate(LocalDate.now())
                .matchTime(LocalTime.now())
                .teamA("Egaleo City Rams")
                .teamB("A.O.M.")
                .sport(Sport.Rugby.name())//Method "toString()" would have done same job here.
                .build();

        match3 = Match.builder()
                .description("Ran out of fantasy...")
                .matchDate(LocalDate.now())
                .matchTime(LocalTime.now())
                .teamA("H2O")
                .teamB("CO2")
                .sport(Sport.Hockey.name())//Method "toString()" would have done same job here.
                .build();

        matchOdds1 = MatchOdds.builder()
                .specifier("X")
                .odd(0.5d).build();

        matchOdds2 = MatchOdds.builder()
                .specifier("Ψ")
                .odd(2.4d).build();

        matchOdds3 = MatchOdds.builder()
                .specifier("Z")
                .odd(1.27d).build();
        
        match1.setMatchOdds(matchOdds1);
        matchOdds1.setMatch(match1);
        matchRepository.save(match1);

        match2.setMatchOdds(matchOdds2);
        matchOdds2.setMatch(match2);
        matchRepository.save(match2);

        match3.setMatchOdds(matchOdds3);
        matchOdds3.setMatch(match3);
        matchRepository.save(match3);

    }
}
