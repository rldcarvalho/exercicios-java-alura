package br.com.rldcarvalho.model;

public class Audio {
    protected String title;
    protected int totalPlays;
    protected int totalLikes;
    protected int rating;

    public void like(){
        this.totalLikes++;
    }

    public void play(){
        this.totalPlays++;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
