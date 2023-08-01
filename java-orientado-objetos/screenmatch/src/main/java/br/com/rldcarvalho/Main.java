package br.com.rldcarvalho;

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

    }
}