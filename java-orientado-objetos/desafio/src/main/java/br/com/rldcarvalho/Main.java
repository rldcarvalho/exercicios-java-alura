package br.com.rldcarvalho;

import br.com.rldcarvalho.model.Favorited;
import br.com.rldcarvalho.model.Music;
import br.com.rldcarvalho.model.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Nosso Quadro");
        myMusic.setArtist("Ana Castela");

        for (int i = 0; i < 1000; i++) {
            myMusic.play();
        }
        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("BolhaDev");
        myPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            myPodcast.play();
        }
        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        Favorited myFavorited = new Favorited();
        myFavorited.add(myMusic);
        myFavorited.add(myPodcast);
    }
}