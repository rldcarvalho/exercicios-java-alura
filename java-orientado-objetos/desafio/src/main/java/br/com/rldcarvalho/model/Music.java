package br.com.rldcarvalho.model;

public class Music extends Audio {
    private String album;
    private String artist;
    private String genre;

    @Override
    public int getRating(){
        return this.getTotalPlays() > 2000 ? 10 : 8;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
