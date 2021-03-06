package com.springboot.race.raceDemo.repositories;

import com.springboot.race.raceDemo.models.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
}
