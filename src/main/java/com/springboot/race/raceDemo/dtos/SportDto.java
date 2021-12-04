package com.springboot.race.raceDemo.dtos;

import com.springboot.race.raceDemo.models.Sport;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SportDto {

    private Long id;
    private String sportType;

}
