package Task8;

import java.util.Objects;


public class CustomDouble{
    int TheWholePart;
    double FractionPart;

    public CustomDouble() {}

    public CustomDouble(final double first_numeric){
        this.TheWholePart = (int)first_numeric;
        this.FractionPart = first_numeric - this.TheWholePart;
    }

    public CustomDouble(final int first_numeric, final double second_numeric){
        setTheWholePart(first_numeric);
        setFractionPart(second_numeric);
    }

    public double Add(){
        return 4;
    }

    public int getTheWholePart() {
        return TheWholePart;
    }

    public void setTheWholePart(int theWholePart) {
        TheWholePart = theWholePart;
    }

    public double getFractionPart() {
        return FractionPart;
    }

    public void setFractionPart(double FractionPart) {
        if((int) FractionPart == 0) {
            this.FractionPart = FractionPart;
        } else {
            this.TheWholePart += (int) FractionPart;
            this.FractionPart = FractionPart - (int) FractionPart;
        }
    }

    public CustomDouble plus(final CustomDouble second_numeric) {
        final double sum = this.TheWholePart + this.FractionPart + second_numeric.TheWholePart + second_numeric.FractionPart;

        return new CustomDouble(sum);
    }

    public CustomDouble minus(final CustomDouble second_numeric) {
        final double difference = this.TheWholePart + this.TheWholePart - (second_numeric.TheWholePart + second_numeric.TheWholePart);

        return new CustomDouble(difference);
    }

    public CustomDouble multiply(final CustomDouble second_numeric) {
        final double result = (this.TheWholePart + this.FractionPart) * (second_numeric.TheWholePart + second_numeric.FractionPart);

        return new CustomDouble(result);
    }

    public CustomDouble divide(final CustomDouble second_numeric) {
        final double result = (this.TheWholePart + this.FractionPart) / (second_numeric.TheWholePart + second_numeric.FractionPart);

        return new CustomDouble(result);
    }

    public boolean isBigger(final CustomDouble second_numeric) {
        return this.TheWholePart + this.FractionPart > second_numeric.TheWholePart + second_numeric.FractionPart;
    }
    public boolean isBiggerEquals(final CustomDouble second_numeric) {
        return this.TheWholePart + this.FractionPart >= second_numeric.TheWholePart + second_numeric.FractionPart;
    }
    public boolean isLess(final CustomDouble second_numeric) {
        return !this.isBiggerEquals(second_numeric);
    }
    public boolean isLessEquals(final CustomDouble second_numeric) {
        return !this.isBigger(second_numeric);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        CustomDouble customDouble = (CustomDouble) obj;
        if(TheWholePart != customDouble.TheWholePart || FractionPart != customDouble.FractionPart)
            return false;
        return TheWholePart == customDouble.TheWholePart && Double.compare(customDouble.FractionPart, FractionPart) == 0;
    }

    @Override
    public int hashCode() {

        return (int)(13 *TheWholePart + 13 * FractionPart);
    }

    public Double toDouble() { return TheWholePart + FractionPart; }
}
