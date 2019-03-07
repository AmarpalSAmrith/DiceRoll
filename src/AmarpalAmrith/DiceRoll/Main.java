package AmarpalAmrith.DiceRoll;

import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Utilities.welcomeMsg("Welcome to Dice Roll :)");
        int sizeOfDice = 0;
        int numberOfRolls = 0;

        switch (Utilities.requestString("Would you like to use a Custom or Standard Dice").toLowerCase()) {

            case "custom":
                sizeOfDice = Utilities.requestInt("Please enter how many faces are on your custom dice?");
                List <Integer> customFaces = Utilities.fillList(sizeOfDice,"Please enter the number on side ");
                numberOfRolls = Utilities.requestInt("Please enter how many dice you would like to roll");
                System.out.println(sizeOfDice + " sided custom dice rolled, " + numberOfRolls + " time(s), gives a total of " + calculateSumOfCustomRolls(numberOfRolls,customFaces));
                break;

            default:
                sizeOfDice = Utilities.requestInt("Please enter the size of dice you want to roll. e.g. 4, 6, 8, 12, 20");
                numberOfRolls = Utilities.requestInt("Please enter how many dice you would like to roll");
                System.out.println(sizeOfDice + " sided dice rolled, " + numberOfRolls + " time(s), gives a total of " + calculateSumOfRolls(sizeOfDice,numberOfRolls));
                break;
        }

    }

    private static int diceRoll(int numberOfSides){
        Random randomNumberGenerator = new Random();
        return randomNumberGenerator.nextInt(numberOfSides) + 1;
    }

    private static int calculateSumOfRolls(int sizeOfDice, int numberOfRolls) {
        int sumOfRolls = 0;
        for (int i = 1; i <= numberOfRolls; i++) {
            sumOfRolls += diceRoll(sizeOfDice);
        }
        return sumOfRolls;
    }

    private static int calculateSumOfCustomRolls(int numberOfRolls, List <Integer> customFaces) {
        int sumOfRolls = 0;
        for (int i = 1; i <= numberOfRolls; i++) {
            sumOfRolls += rollCustomDice(customFaces);
        }
        return sumOfRolls;
    }

    private static int rollCustomDice(List <Integer> customFaces) {
        return customFaces.get(diceRoll(customFaces.size()) - 1);
    }
}