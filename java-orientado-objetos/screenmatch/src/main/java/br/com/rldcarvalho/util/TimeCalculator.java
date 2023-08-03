package br.com.rldcarvalho.util;

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
