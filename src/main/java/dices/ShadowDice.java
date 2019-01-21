package dices;

import enums.ShadowAction;

import java.util.Random;

public class ShadowDice extends Dice {

    public ShadowDice(Random dice) {
        super(dice);
    }

    public ShadowAction shadowRoll() {
        ShadowAction result = null;
        switch (roll()) {
            case 1: result = ShadowAction.CHARACTER;
            break;
            case 2: result = ShadowAction.ARMY;
            break;
            case 3: result = ShadowAction.MUSTER;
            break;
            case 4: result = ShadowAction.EVENT;
            break;
            case 5: result = ShadowAction.MUSTER_ARMY;
            break;
            case 6: result =  ShadowAction.EYE;
            break;
        }
        return result;
    }
}
