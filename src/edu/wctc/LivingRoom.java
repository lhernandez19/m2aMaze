package edu.wctc;

public class LivingRoom extends Room implements Lootable{

    public LivingRoom(String name){
        super(name);
    }

    @Override
    public String loot(Player player) {
        return null;
    }

    @Override
    public String getDescription() {
        return "You are in the living room.";
    }
}
