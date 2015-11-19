// Team 42 - Dylan Wright, Mei Huang
// APCS1 pd5
// HW33 -- Do you even add, Bro? 
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
    public void add(Rational newRational) { 
        if (this.denominator == newRational.denominator) {
            numerator += newRational.numerator;
            denominator = newRational.denominator; }
    }
    public void subtract(Rational newRational) {
        if (this.denominator == newRational.denominator) {
            numerator -= newRational.numerator;
            denominator = newRational.denominator; } 
    }
    public int greatestcd(int a, int b) {
	if (a == b) {return a;} 
	int greater = Math.max(a,b);
	int smaller = Math.min(a,b); 
	if (greater%smaller == 0) {
	    return smaller; 
	}
    else {
        return greatestcd(smaller,greater%smaller); 
	}
    }
	public double gcd() {
	    return greatestcd(this.numerator,this.denominator);
	}
	public void reduce() {
	    this.numerator /= gcd();
	    this.denominator /= gcd();
	}
	public static int gcdS(int a, int b) { 
	    int c = 0; 
	    if (a < b) { 
	        a = c; 
	        a = b; 
	        b = c;
	    }
	    while (a % b != 0) {
	        int i = a; 
	        int f = b; 
	        a = b; 
	        b = i % f; 
	    } 
	    return b; 
	    }
    public int compareTo(Rational obj) { 
        if (this.floatValue() == obj.floatValue()) {
            return 0; 
        }
        if (this.floatValue() > obj.floatValue()) { 
            return 1; 
        }
        else { 
            return -1; 
        }
    }
     public static void main (String[] args) { 
        Rational r = new Rational(2,3); 
        Rational s = new Rational(1,6);
        Rational t = new Rational(2,6);
        Rational q = new Rational(4,18);
        System.out.println(s.floatValue()); //should ouput 0.5
        System.out.println(t.gcd()); //should output 2
        System.out.println(r); //should output 2/3
        System.out.println(s); //should output 1/6
        r.multiply(s); // 2/3 x 1/6
        System.out.println(r); // should output 2/18 
        System.out.println(s); // should output 1/6
        r.divide(s); // 2/18 / 1/6  
        System.out.println(r); //should output 12/18 
        System.out.println(s); //should output 1/6 
        s.add(t); // 1/6 + 2/6 
        System.out.println(s);  // should output 3/6
        System.out.println(t); // should output 2/6
        s.subtract(t); // 3/6 - 2/6 
        System.out.println(s); // should output 1/6 
        System.out.println(t); // should output 2/6
        q.reduce(); 
        System.out.println(q); // should output 1/2
        System.out.println(r.compareTo(s)); //should output 1
    	System.out.println(gcdS(40,12)); //should output 4
    	System.out.println(gcdS(52,6)); //should output 2
    }
}

