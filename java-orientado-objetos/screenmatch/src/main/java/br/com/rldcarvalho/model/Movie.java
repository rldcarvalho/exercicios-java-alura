package br.com.rldcarvalho.model;

public class Movie extends Title {

    private String director;
    public Movie(String name, int releaseYear, int lengthInMinutes) {
        super();
        this.name = name;
        this.releaseYear = releaseYear;
        this.lengthInMinutes = lengthInMinutes;
    }

}
