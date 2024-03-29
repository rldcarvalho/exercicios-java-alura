package br.com.rldcarvalho.model;

import br.com.rldcarvalho.interfaces.Classifiable;

public class Serie extends Title implements Classifiable {

    private int seasons;
    private int episodesPerSeason;
    private int minutesPerEpisode;
    private boolean active;
    private int totalViews;

    public int getSeasons() {
        return seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public int getLengthInMinutes() {
        return this.seasons * this.episodesPerSeason * this.minutesPerEpisode;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public int getRating() {
        return totalViews > 400 ? 4 : 2;
    }
}
