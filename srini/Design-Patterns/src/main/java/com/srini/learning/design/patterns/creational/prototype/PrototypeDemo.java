package com.srini.learning.design.patterns.creational.prototype;

import com.srini.learning.design.patterns.creational.prototype.example.Movie;
import com.srini.learning.design.patterns.creational.prototype.example.Registry;

public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem(Movie.class);
        movie.setTitle("Creational prototype pattern");
        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());
        Movie anotherMovie = (Movie) registry.createItem(Movie.class);
        anotherMovie.setTitle("Gang of Four");
        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());

    }
}
