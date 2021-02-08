package edu.wctc;

public class Basement extends Room implements Interactable {

    public Basement (String name) {
        super(name);
    }

    @Override
    public String interact(Player player) {
        player.addToScore(10);
        return "You earned points.";
    }

    @Override
    public String getDescription() {
        return "You are in the basement.";
    }
}
