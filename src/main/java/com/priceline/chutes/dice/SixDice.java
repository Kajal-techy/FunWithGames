package com.priceline.chutes.dice;

import java.util.Random;

public class SixDice implements Dice {

    // Todo: Can make configurable
    int MAX_DICE_NUMBER = 6;
    private final Random random = new Random();

    @Override
    public int throwDice() {
        return random.nextInt(getMaxDiceNumber()) + 1;
    }

    @Override
    public int getMaxDiceNumber() {
        return MAX_DICE_NUMBER;
    }
}
