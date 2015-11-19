// Team 42 - Dylan Wright, Mei Huang
// APCS1 pd5
// HW33 -- Irrationality Stops Here
// 2015-11-18

public class Rational {
    
    private int numerator, denominator;
    
    public Rational() {
        numerator = 0;
        denominator = 1;
    }
    
    public Rational(int newNum, int newDen) {
        if (newDen == 0) {
            System.out.println("Please enter a valid denominator.");
            numerator = 0;
            denominator = 1;
        }
        else {
            numerator = newNum;
            denominator = newDen;
        }
    }
    
    public String toString() {
        return numerator + "/" + denominator;
    }
    
    public double floatValue() {
        return numerator / (denominator * 1.0);
    }
    
    public void multiply(Rational newRational) {
        numerator *= newRational.numerator;
        denominator *= newRational.denominator;
    }
    
    public void divide(Rational newRational) {
        numerator *= newRational.denominator;
        denominator *= newRational.numerator;
    }
}
