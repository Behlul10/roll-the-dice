package com.pluralsight;

public class DiceRolling {
    public static void main(String[] args) {
        Dice myDice = new Dice();
        int roll1;
        int roll2;
        int rollSum;

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 0; i < 101; i++) {
            roll1 = myDice.roll();
            roll2 = myDice.roll();
            rollSum = roll1 + roll2;

            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + (roll1 + roll2));
            switch (rollSum) {
                case 2 -> twoCounter++;
                case 4 -> fourCounter++;
                case 6 -> sixCounter++;
                case 7 -> sevenCounter++;
            }
        }//66
        System.out.printf("""
                ### Counters ###
                2 Counter: %d
                4 Counter: %d
                6 Counter: %d
                7 Counter: %d
                """, twoCounter, fourCounter, sixCounter, sevenCounter);
    }
}
