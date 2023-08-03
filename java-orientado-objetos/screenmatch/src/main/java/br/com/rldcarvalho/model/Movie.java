package br.com.rldcarvalho.model;

import br.com.rldcarvalho.interfaces.Classifiable;

public class Movie extends Title implements Classifiable {

    private String director;
    public Movie(String name, int releaseYear, int lengthInMinutes) {
        super();
        this.name = name;
        this.releaseYear = releaseYear;
        this.lengthInMinutes = lengthInMinutes;
    }

    @Override
    public int getRating() {
        return (int) getAverageRating() / 2;
    }
}
