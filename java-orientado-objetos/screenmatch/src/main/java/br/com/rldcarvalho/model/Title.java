package br.com.rldcarvalho.model;

import br.com.rldcarvalho.exception.YearConversionErrorException;

public class Title {
    protected String name;
    protected int releaseYear;
    protected boolean inThePlan;
    protected double ratingSum;
    protected int totalRating;
    protected int lengthInMinutes;

    public Title(){}
    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();
        if(myTitleOmdb.year().length() > 4){
            throw new YearConversionErrorException("Não consegui converter o ano porque tem mais de quatro caracteres");
        }
        this.releaseYear = Integer.valueOf(myTitleOmdb.year());
        this.lengthInMinutes = Integer.valueOf(myTitleOmdb.runtime().substring(0,2));
    }

    public void rate(double score){
        this.ratingSum += score;
        this.totalRating++;
    }

    public void showDatasheet(){
        System.out.println("Nome: " + this.name);
        System.out.println("Ano de lançamento: " + this.releaseYear);
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

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setInThePlan(boolean inThePlan) {
        this.inThePlan = inThePlan;
    }

    public void setRatingSum(double ratingSum) {
        this.ratingSum = ratingSum;
    }

    public void setTotalRating(int totalRating) {
        this.totalRating = totalRating;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    @Override
    public String toString() {
        return "Title{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
