package edu.wctc;
import java.util.List;

public class Player {

    //Create field
    private int score;
    private List<String> inventory;

    //Create method to add player's inventory list
    public void addToInventory (String inventoryList)
    {
        inventory.add(inventoryList);
    }

    //Create method for player's score
    public void addToScore (int points)
    {
        score += points;
    }

    //Create method to display the inventory list
    public String getInventory ()
    {
        if(inventory.isEmpty())
        {
           return "Empty";
        }
        else
        {
            return inventory.toString();
        }
    }

    public int getScore() {
        return score;
    }


}
