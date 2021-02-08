package edu.wctc;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        Maze maze = new Maze(player);

        Scanner scanner = new Scanner(System.in);

        while (!maze.isFinished()){
            System.out.println(maze.getCurrentRoomDescription());
            System.out.println(maze.getCurrentRoomExits());
            System.out.println(">> \nU - Up \n");

            char command = scanner.nextLine().toLowerCase().charAt(0);

            if (command == 'l'){
                System.out.println(maze.lootCurrentRoom());
            }else if (command == 'i'){
                System.out.println(maze.interactWithCurrentRoom());
            }else if (command == 'x'){
                System.out.println(maze.exitCurrentRoom());
            }else if (command == 'v'){
                System.out.println(maze.getPlayerInventory());
            }else{
                maze.move(command);
            }

        }
        System.out.println(maze.getPlayerScore());
    }




}