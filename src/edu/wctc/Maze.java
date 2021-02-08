package edu.wctc;

public class Maze {

    private Room currentRoom;
    private Player player;
    private boolean isFinished;

    public boolean isFinished() {
        return isFinished;
    }

    public Maze(Player player) {
        this.player = player;
        LivingRoom livingRoom = new LivingRoom ("Living room");
        Basement basement = new Basement("You have entered the basement");
        livingRoom.setDown(basement);
        basement.setUp(livingRoom);
        currentRoom = livingRoom;
        Kitchen kitchen = new Kitchen("Kitchen Room");
        kitchen.setEast(livingRoom);
        livingRoom.setWest(kitchen);
    }


    public String exitCurrentRoom() {
        if (currentRoom instanceof Exit exitRoom) {
            isFinished = true;
            return exitRoom.exit(player);
        } else {
            return "You can't exit from this room";
        }
    }


    public String interactWithCurrentRoom() {
        if (currentRoom instanceof Interactable interact) {
            isFinished = true;
            return interact.interact(player);
        } else {
            return "You can't interact from this room";
        }

    }


    public String lootCurrentRoom() {
        if (currentRoom instanceof Lootable loot) {
            isFinished = true;
            return loot.loot(player);
        } else {
            return "You can't loot from this room";
        }
    }
    public boolean move(char directions){
        if (currentRoom.isValidDirection(directions)){
            currentRoom = currentRoom.getAdjoiningRoom(directions);
        }
        return false;
    }

    public int getPlayerScore() {
        return player.getScore();
    }

    public String getPlayerInventory() {
        return player.getInventory();

    }

    public String getCurrentRoomDescription() {

        return currentRoom.getName();
    }

    public String getCurrentRoomExits() {

        return exitCurrentRoom();
    }


}