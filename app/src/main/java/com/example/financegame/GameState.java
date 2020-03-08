package com.example.financegame;

public class GameState {
    private int points;

    public GameState() {
        this.points = 1000;
    }

    public int getPoints() {
        return points;
    }

    public void decrementPoints(int num) {
        points -= num;
    }

    public void incrementPoints(int num) {
        points += num;
    }
}
