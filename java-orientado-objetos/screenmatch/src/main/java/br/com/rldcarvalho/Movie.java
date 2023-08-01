package br.com.rldcarvalho;

public class Movie {
    private String name;
    private int releaseYear;
    private boolean inThePlan;
    private double ratingSum;
    private int totalRating;
    private int lengthInMinutes;

    public Movie(String name, int releaseYear, int lengthInMinutes) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.lengthInMinutes = lengthInMinutes;
    }

    public void showDatasheet(){
        System.out.println("Nome do filme: " + this.name);
        System.out.println("Ano de lançamento: " + this.releaseYear);
    }

    public void rate(double score){
        this.ratingSum += score;
        this.totalRating++;
    }

    public double getAverageRating(){
        return this.ratingSum / this.totalRating;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isInThePlan() {
        return inThePlan;
    }

    public double getRatingSum() {
        return ratingSum;
    }

    public int getTotalRating() {
        return totalRating;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }
}
