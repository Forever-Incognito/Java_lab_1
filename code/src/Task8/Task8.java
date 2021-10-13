package Task8;

import java.util.Objects;

public class Task8 {
    public static void main(String[] args) {
        final CustomDouble first_numeric = new CustomDouble(1.6);
        final CustomDouble second_numeric = new CustomDouble(-1.8);
        final CustomDouble numericSum = first_numeric.plus(second_numeric);
        final CustomDouble numericDifference = first_numeric.minus(second_numeric);

        System.out.println();
        System.out.println("first_numeric = " + first_numeric.toDouble());
        System.out.println("second_numeric = " + second_numeric.toDouble());
        System.out.println("first_numeric + second_numeric = " + numericSum.toDouble());
        System.out.println("first_numeric - second_numeric = " + numericDifference.toDouble());
        System.out.println("first_numeric > second_numeric = " + first_numeric.isBigger(second_numeric));
        System.out.println("first_numeric.equals(second_numeric): " + first_numeric.equals(second_numeric));
    }
}