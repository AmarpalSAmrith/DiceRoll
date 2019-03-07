package AmarpalAmrith.DiceRoll;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Utilities.welcomeMsg("Welcome to Dice Roll :)");
        int sizeOfDice = Utilities.requestInt("Please enter the size of dice you want to roll. e.g. 4, 6, 8, 12, 20");
        int numberOfRolls = Utilities.requestInt("Please enter how many dice you would like to roll");
        System.out.println(sizeOfDice + " sided dice rolled, " + numberOfRolls + " time(s), gives a total of " + calculateSumOfRolls(sizeOfDice,numberOfRolls));
    }

    public static int diceRoll(int numberOfSides){
        Random randomNumberGenerator = new Random();
        return randomNumberGenerator.nextInt(numberOfSides) + 1;
    }

    public static int calculateSumOfRolls(int sizeOfDice, int numberOfRolls) {
        int sumOfRolls = 0;
        for (int i = 1; i <= numberOfRolls; i++) {
            sumOfRolls += diceRoll(sizeOfDice);
        }
        return sumOfRolls;
    }
}
