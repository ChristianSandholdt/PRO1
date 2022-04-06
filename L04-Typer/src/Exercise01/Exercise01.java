package Exercise01;

public class Exercise01 {
    public static void main(String[] args) {
        int i1, i2, a = 4, b =11, c;
        double d1, d2, r = 4.0, s = 11.0;

        // For each of the following lines write down the value of the changed variable:

        i1 = b / a;
        System.out.println(i1);
        System.out.println("i1 = b/a Expected 2 da man smider decimalerne væk");

        c = (int)(s / r);
        System.out.println(c);
        System.out.println("c = (int)(s/r) Expected 2 da (int) fjerner decimalerne");

        d1 = b / a;
        System.out.println(d1);
        System.out.println("d1 = b/a Expected 2 da man godt kan lave en double om til en int");

        d2 = s / r;
        System.out.println(d2);
        System.out.println("d2 = s/r Expected 2.75 da en double godt kan divideres med en double");

        d1 = b/r;
        System.out.println(d1);
        System.out.println("d1 = b/r Expected 2.75");

        d2 = 11.0 / 4.0;
        System.out.println(d2);
        System.out.println("d2 = 11.0 / 4.0 Expected 2.75 da det er 2 doubles");

        d1 = 11.0 / a * c;
        System.out.println(d1);
        System.out.println("d1 = 11.0 / a * c Expected 0 da c ikke har nogen værdi men er defineret længere oppe så bliver 5.5");

        i1++;
        System.out.println(i1);
        System.out.println("i1++ Expected i1+1 da den er defineret længere oppe bliver den 3");

        i1 +=4;
        System.out.println(i1);
        System.out.println("i1 += 4 Expected 6, da i1 er defineret til 3 ovenover");

        i1 = b % a;
        System.out.println(b % a);
        System.out.println("b % a Expected 3 da 3 er overskydende efter at a er gået op i b 2 gange");

        i1 = 3 + 7 *2;
        System.out.println(3 + 7 * 2);
        System.out.println("3 + 7 * 2 Expected 17 da man ganger 7 med 2 før man til sidst tilføjer de 3");

        i2 = (3 + 7) *2;
        System.out.println((3 + 7) * 2);
        System.out.println("(3 + 7) * 2 Expected 20 da man her plusser 3 og 7 først da det er i en parantes hvorefter man ganger med 2");


    }
}
