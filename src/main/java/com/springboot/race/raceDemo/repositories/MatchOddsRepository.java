package com.springboot.race.raceDemo.repositories;

import com.springboot.race.raceDemo.models.MatchOdds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchOddsRepository extends JpaRepository<MatchOdds, Long> {
}
