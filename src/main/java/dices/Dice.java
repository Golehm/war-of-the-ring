package dices;

import java.util.Random;

public class Dice {

    private Random die;

    public Dice(Random die) {
        this.die = die;
    }

    public int roll() {
        return die.nextInt(6) + 1;
        //return (int)(Math.random() * 6.0D);
    }
}
