package dices;

import enums.ShadowAction;
import org.junit.Test;

import java.util.Random;

public class DicesTestSuite {
    @Test
    public void testRoll() {
        Dice dice = new Dice(new Random());
        System.out.println("Roll = " + dice.roll());
    }
    @Test
    public void testFreePeopleRoll() {
        FreePeopleDice dice = new FreePeopleDice(new Random());
        System.out.println("Roll = " + dice.freePeopleRoll());
    }
    @Test
    public void testShadowRoll() {
        ShadowDice dice = new ShadowDice(new Random());
        System.out.println("Roll = " + dice.shadowRoll());
    }
    @Test
    public void testShadowRollEYE() {
        ShadowDice dice = new ShadowDice(new Random());
        ShadowAction action = ShadowAction.CHARACTER;
        while(action != ShadowAction.EYE) {
            action = dice.shadowRoll();
            System.out.println("Roll");
        }
        System.out.println();
    }
    @Test
    public void testRollOne() {
        Dice dice = new Dice(new Random());
        int result = 0;
        while (result != 1) {
            result = dice.roll();
            System.out.print("Roll, ");
        }
        System.out.println();
    }
    @Test
    public void testRollTwo() {
        Dice dice = new Dice(new Random());
        int result = 0;
        while (result != 2) {
            result = dice.roll();
            System.out.print("Roll, ");
        }
        System.out.println();
    }
    @Test
    public void testRollThree() {
        Dice dice = new Dice(new Random());
        int result = 0;
        while (result != 3) {
            result = dice.roll();
            System.out.print("Roll, ");
        }
        System.out.println();
    }
    @Test
    public void testRollFour() {
        Dice dice = new Dice(new Random());
        int result = 0;
        while (result != 4) {
            result = dice.roll();
            System.out.print("Roll, ");
        }
        System.out.println();
    }
    @Test
    public void testRollFive() {
        Dice dice = new Dice(new Random());
        int result = 0;
        while (result != 5) {
            result = dice.roll();
            System.out.print("Roll, ");
        }
        System.out.println();
    }
    @Test
    public void testRollSix() {
        Dice dice = new Dice(new Random());
        int result = 0;
        while (result != 6) {
            result = dice.roll();
            System.out.print("Roll, ");
        }
        System.out.println();
    }

}
