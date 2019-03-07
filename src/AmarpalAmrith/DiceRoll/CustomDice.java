package AmarpalAmrith.DiceRoll;

import java.util.List;
import java.util.Random;

public class CustomDice implements Dice {

    private List <Integer> sides;

    public CustomDice(List<Integer> sides) {
        this.sides = sides;
    }

    @Override
    public int roll() {
        Random randomNumberGenerator = new Random();
        return sides.get(randomNumberGenerator.nextInt(sides.size()));
    }
}
