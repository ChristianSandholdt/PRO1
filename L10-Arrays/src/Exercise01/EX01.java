package Exercise01;

import java.util.Arrays;

public class EX01 {
    public static void main(String[] args) {
        //A
        int valuesA[] = new int[8];
        System.out.println(" (a) " + Arrays.toString(valuesA));
        //B
        int valuesB[] = {2, 44, -23, 99, 8, -5, 7, 10, 20, 30};
        System.out.println(" (b) " + Arrays.toString(valuesB));
        //C
        int valuesC[] = new int[10];
        for (int i = 0; i < valuesC.length; i++) {
            valuesC[i] = i;
        }
        System.out.println(" (C) " + Arrays.toString(valuesC));

        //D
        int valuesD[] = new int[10];
        for (int i = 0; i < valuesD.length; i++){
            valuesD[i] = 2+i*2;
        }
        System.out.println(" (D) " + Arrays.toString(valuesD));

        //E
        double valuesE[] = new double[10];
        for (double i = 0; i < valuesE.length; i++){
            valuesE[(int) i] = Math.pow(i+1,2);
        }
        System.out.println( " (E) " + Arrays.toString(valuesE));

        //F
        double valuesF[] = new double [10];
        for (double i = 0; i < valuesF.length; i++){
            if (i%2 == 0) {
                valuesF[(int) i] = 0;
            } else if (i%2 != 0){
                valuesF[(int) i] = 1;
            }
        } System.out.println(" (F) " + Arrays.toString(valuesF));
        //G
        double valuesG[] = new double[10];
        for (double i = 0; i < valuesG.length; i++){
            if (i>5){
                valuesG[(int) i] = i - 5;
            }else if (i<5){
                valuesG[(int) i] = i;
            }
        } System.out.println(" (G) " + Arrays.toString(valuesG));
        //H
        double valuesH[] = new double[10];
        for (double i = 0; i < valuesH.length; i++){
            if (i == 0){
                valuesH[(int) i] = 0;
            }else if (i%2 == 0){
                valuesH[(int) i] = valuesH[(int) (i - 1)]+ 1;
            }else if ( i % 2 > 0){
                valuesH[(int) i] = valuesH[(int) i-1]+3;
            }
        }
        System.out.println(" (H) " + Arrays.toString(valuesH));



    }
}
