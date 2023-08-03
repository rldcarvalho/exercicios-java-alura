package br.com.rldcarvalho;

import br.com.rldcarvalho.model.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void add(Title title){
        this.totalTime += title.getLengthInMinutes();
    }
}
