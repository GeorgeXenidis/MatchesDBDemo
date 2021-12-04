package com.springboot.race.raceDemo.models;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MatchOdds {

    private Long id;
    private String specifier;
    private Double odd;

}
