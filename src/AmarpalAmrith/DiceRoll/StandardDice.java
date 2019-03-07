package AmarpalAmrith.DiceRoll;

import java.util.Random;

public class StandardDice implements Dice {

    private int size;

    public StandardDice(int size) {
        this.size = size;
    }

    @Override
    public int roll() {
        Random randomNumberGenerator = new Random();
        return randomNumberGenerator.nextInt(size) + 1;
    }
}
