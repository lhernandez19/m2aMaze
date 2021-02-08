package edu.wctc;

public abstract class Room {

    //String field called name for the Room class
    private String name;

    //String fields for the Room class
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room down;
    private Room up;

    public Room(String name)
    {
        this.name = name;
    }

    public abstract String getDescription();

    public Room getAdjoiningRoom(char direction) {
        if (direction == 'w') {
            return west;
        } else if (direction == 'n') {
            return north;
        } else if (direction == 'e') {
            return east;
        } else if (direction == 's') {
            return south;
        } else if (direction == 'd') {
            return down;
        } else if (direction == 'u') {
            return up;
        } else {
            return null;
        }
    }

    public boolean isValidDirection(char direction) {
        if (direction == 'w') {
            return west != null;
        } else if (direction == 'n') {
            return north != null;
        } else if (direction == 'e') {
            return east != null;
        } else if (direction == 's') {
            return south != null;
        } else if (direction == 'd') {
            return down != null;
        } else if (direction == 'u') {
            return up != null;
        } else {
            return false;
        }
    }

    public String getExits()
    {
        String name = "There are exits to the ";
        if (north != null){
            name += "North";
        }
        if (south != null) {
            name += "South";
        }
        if (east != null) {
            name += "East";
        }
        if (west != null) {
            name += "West";
        }
        if (down != null) {
            name += "Down";
        }
        if (up != null) {
            name += "Up";
        }
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public Room getDown() {
        return down;
    }

    public void setDown(Room down) {
        this.down = down;
    }

    public Room getUp() {
        return up;
    }

    public void setUp(Room up) {
        this.up = up;
    }

}
