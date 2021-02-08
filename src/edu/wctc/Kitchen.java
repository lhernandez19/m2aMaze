package edu.wctc;

public class Kitchen extends Room implements Exit {
    public Kitchen (String name)  {
        super(name);
    }

    @Override
    public String exit(Player player){
        return "You have exited the maze";
    }

    @Override
    public String getDescription() {
        return "You are in the kitchen";
    }


}
