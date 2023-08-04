package br.com.rldcarvalho.model;

public class Favorited {
    public void add(Audio audio){
        if (audio.getRating() > 8){
            System.out.println(audio.getTitle() + " é um sucesso absoluto!");
        }else {
            System.out.println(audio.getTitle() + " está na boca do povo");
        }
    }
}
