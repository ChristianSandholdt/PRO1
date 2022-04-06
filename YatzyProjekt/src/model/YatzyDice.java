package model;

import java.util.Random;

public class YatzyDice {
    // Face values of the 5 dice.
    // 1 <= values[i] <= 6 for i in [0..4]
    private int[] values = new int[5];

    // Number of times the 5 dice have been thrown.
    // 0 <= throwCount <= 3.
    public int throwCount = 0;

    // Random number generator.
    private final Random random = new Random();

    /**
     * Return the 5 face values of the dice.
     */
    public int[] getValues() {
        return values;
    }

    /**
     * Set the 5 face values of the dice.<br/>
     * Pre: 1 <= values[i] <= 6 for i in [0..4].<br/>
     * Note: This method is only to be used in tests.
     */
    void setValues(int[] values) {
        this.values = values;
    }

    /**
     * Return the number of times the 5 dice has been thrown.
     */
    public int getThrowCount() {
        return throwCount;
    }

    /**
     * Reset the throw count.
     */
    public void resetThrowCount() {
        this.throwCount = 0;
        // TODO
    }

    /**
     * Roll the 5 dice. Only roll dice that are not hold.<br/>
     * Note: holdStatus[i] is true, if die no. i is hold (for i in [0..4]).
     */
    public void throwDice(boolean[] holdStatus) {
        for (int i = 0; i < 5; i++) {
            if (!holdStatus[i]) {
                values[i] = random.nextInt(1, 5);
                // TODO
            }
        }
    }
    // -------------------------------------------------------------------------

    /**
     * Return all results possible with the current face values.<br/>
     * The order of the results is the same as on the score board.<br/>
     * Note: This is an optional method. Comment this method out,<br/>
     * if you don't want use it.
     */
    public int[] getResults() {
        int[] results = new int[17];
        for (int i = 0; i <= 4; i++) {
            results[i] = this.sameValuePoints(i + 1);
        }
        results[8] = this.onePairPoints();
        results[9] = this.twoPairPoints();
        results[10] = this.threeSamePoints();
        results[11] = this.fourSamePoints();
        results[12] = this.fullHousePoints();
        results[13] = this.smallStraightPoints();
        results[14] = this.largeStraightPoints();
        results[15] = this.chancePoints();
        results[16] = this.yatzyPoints();

        return results;
    }

    // -------------------------------------------------------------------------

    // Return an int[7] containing the frequency of face values.
    // Frequency at index v is the number of dice with the face value v, 1 <= v <= 6.
    // Index 0 is not used.
    // Note: This method can be used in several of the following methods.
    //TODO
    private int[] frequency() {
        int[] freq = new int [7];
                for ( int value: values) {
                    freq[value]++;
           }
        return freq;
    }

    /**
     * Return same-value points for the given face value.<br/>
     * Returns 0, if no dice has the given face value.<br/>
     * Pre: 1 <= value <= 6;
     */
    public int sameValuePoints(int value) {
        // TODO
        return frequency()[value] * value;
    }

    /**
     * Return points for one pair (for the face value giving the highest points).<br/>
     * Return 0, if there aren't 2 dice with the same face value.
     */
    public int onePairPoints() {
        // TODO
        int sum = 0;
        int [] freq = frequency();
        for (int i = 0; i <= 6; i++) {
            if (freq[i] >= 2) {
                sum = i * 2;
            }
            }
                return sum;
            }

    /**
     * Return points for two pairs<br/>
     * (for the 2 face values giving the highest points).<br/>
     * Return 0, if there aren't 2 dice with the same face value<br/>
     * and 2 other dice with the same but different face value.
     */
    public int twoPairPoints() {
        // TODO
        int sum1 = onePairPoints();
        int sum2 = 0;
        int i = 6;
        int [] freq = frequency();
       while (sum1 != 0 && i > 0){
            if (freq[i] >= 2 && i * 2 != sum1) {
                sum2 = i * 2;
                return sum1 + sum2;
            }
            i--;
        }
        return 0;
    }

    /**
     * Return points for 3 of a kind.<br/>
     * Return 0, if there aren't 3 dice with the same face value.
     */
    public int threeSamePoints() {
        // TODO
        int sum = 0;
        int [] freq = frequency();
        for (int i = 0; i <= 6; i++) {
            if (freq[i] >= 3) {
                sum = i * 3;
            }
        }
        return sum;
    }

    /**
     * Return points for 4 of a kind.<br/>
     * Return 0, if there aren't 4 dice with the same face value.
     */
    public int fourSamePoints() {
        // TODO
        int sum = 0;
        int [] freq = frequency();
        for (int i = 0; i <= 6; i++) {
            if (freq[i] >= 4) {
                sum = i * 4;
            }
        }
        return sum;
    }

    /**
     * Return points for full house.<br/>
     * Return 0, if there aren't 3 dice with the same face value<br/>
     * and 2 other dice with the same but different face value.
     */
    public int fullHousePoints() {
        // TODO
        int sum1 = onePairPoints();
        int sum2 = threeSamePoints();
        int [] freq = frequency();
        int i = 6;
        while (sum1 != 0 && i > 0){
            if (freq[i] >= 2 && i * 2 != sum1) {
                return sum1 + sum2;
            }
            i--;
        }
        return 0;
    }

    /**
     * Return points for small straight.<br/>
     * Return 0, if the dice aren't showing 1,2,3,4,5.
     */
    public int smallStraightPoints() {
        // TODO
        int [] freq = frequency();
        int points = 0;
        for ( int i = 1; i < frequency().length-1; i++) {
            if (freq[i] == 1) {
                points += i;
            } else {
            return 0;
        }
            }
        return points;
    }

        /**
         * Return points for large straight.<br/>
         * Return 0, if the dice aren't showing 2,3,4,5,6.
         */
        public int largeStraightPoints () {
            // TODO
            int [] freq = frequency();
            int points = 0;
            for ( int i = 2; i < frequency().length; i++) {
                if (freq[i] == 1) {
                    points += i;
                } else {
                    return 0;
                }
            }
            return points;
        }

    /**
     * Return points for chance (the sum of face values).
     */
    public int chancePoints() {
        int points = 0;
        for (int face : values) {
            points += face;
        }
        return points;
    }

    /**
     * Return points for yatzy (50 points).<br/>
     * Return 0, if there aren't 5 dice with the same face value.
     */
    public int yatzyPoints() {
        // TODO
        int [] freq = frequency();
        for (int i = 0; i <= 6; i++) {
            if (freq[i] == 5) {
                return 50;
            }
        }
        return 0;
    }
}
