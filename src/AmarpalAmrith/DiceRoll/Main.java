package AmarpalAmrith.DiceRoll;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        Utilities.welcomeMsg("Welcome to Dice Roll :)");
        Random randomNoGenerator = new Random();
        int randNo = randomNoGenerator.nextInt(6) + 1;
        System.out.println("Dice rolled. Result: " + randNo);
    }
}
