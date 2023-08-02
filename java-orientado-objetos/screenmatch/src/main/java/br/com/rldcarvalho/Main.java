package br.com.rldcarvalho;

import br.com.rldcarvalho.model.Movie;
import br.com.rldcarvalho.model.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O poderoso chefão", 1970, 180);

        myMovie.showDatasheet();
        myMovie.rate(8);
        myMovie.rate(5);
        myMovie.rate(10);

        System.out.println(myMovie.getRatingSum());
        System.out.println(myMovie.getTotalRating());
        System.out.println(myMovie.getAverageRating());

        Serie lost = new Serie();
        lost.setName("Lost");
        lost.setReleaseYear(2000);
        lost.showDatasheet();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Duração para maratonar a série: " + lost.getLengthInMinutes());

    }
}