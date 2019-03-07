package AmarpalAmrith.DiceRoll;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Utilities.welcomeMsg("Welcome to Dice Roll :)");

        boolean isCustom = "custom".equals(Utilities.requestString("Would you like to use a Custom or Standard Dice").toLowerCase());

        Dice dice = isCustom ? createCustomDice() : createStandardDice();
        int numberOfRolls = Utilities.requestInt("Please enter how many dice you would like to roll");
        int sumOfRolls = calculateTotalRoll(dice,numberOfRolls);
        System.out.println("Total thrown: " + sumOfRolls);
    }

    private static Dice createCustomDice() {
        int numberOfSides = Utilities.requestInt("Please provide the number of faces to your dice");
        List <Integer> sides = Utilities.fillList(numberOfSides,"Please enter the number on side ");
        return new CustomDice(sides);
    }
    private static Dice createStandardDice() {
        return new StandardDice(Utilities.requestInt("Please provide the number of sides to your dice"));
    }
    public static int calculateTotalRoll(Dice dice, int numberOfThrows) {
        int sumOfThrows = 0;
        for (int i = 0; i < numberOfThrows; i++) {
            sumOfThrows += dice.roll();
        }
        return sumOfThrows;
    }
}