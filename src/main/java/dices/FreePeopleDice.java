package dices;

import enums.FreePeopleAction;

import java.util.Random;

public class FreePeopleDice extends Dice {

    public FreePeopleDice(Random dice) {
        super(dice);
    }

    public FreePeopleAction freePeopleRoll() {
        FreePeopleAction result = null;
        switch (roll()) {
            case 1: result = FreePeopleAction.CHARACTER;
                break;
            case 2: result = FreePeopleAction.CHARACTER;
                break;
            case 3: result = FreePeopleAction.MUSTER;
                break;
            case 4: result = FreePeopleAction.EVENT;
                break;
            case 5: result = FreePeopleAction.MUSTER_ARMY;
                break;
            case 6: result =  FreePeopleAction.WILL_OF_THE_WEST;
                break;
        }
        return result;
    }
}
