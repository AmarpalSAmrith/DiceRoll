package AmarpalAmrith.DiceRoll;

public class Main {

    public static void main(String[] args) {

        Utilities.welcomeMsg("Welcome to Dice Roll :)");
        int sizeOfDice = Utilities.requestInt("Please enter the size of dice you want to roll. e.g. 4, 6, 8, 12, 20");
        int numberOfRolls = Utilities.requestInt("Please enter how many dice you would like to roll");

        for (int i = 1; i <= numberOfRolls; i++) {
            System.out.println("Dice roll " + i + " Result: " + Utilities.diceRoll(sizeOfDice));
        }
    }
}
