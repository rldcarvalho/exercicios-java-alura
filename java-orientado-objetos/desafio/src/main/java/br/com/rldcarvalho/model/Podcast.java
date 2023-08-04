package br.com.rldcarvalho.model;

public class Podcast extends Audio{

    private String host;
    private String description;

    @Override
    public int getRating(){
        return this.getTotalLikes() > (this.getTotalPlays() / 10) ? 10 : 8;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
