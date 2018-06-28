package com.srini.learning.design.patterns.structural.bridge.example2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Movie {

    private String classification;
    private String runtime;
    private String title;
    private String year;

}
