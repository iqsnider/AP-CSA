/* Term 2 Assignment 1 - Fraction */
/* A class which is used to represent fractions*/
public class Fraction {
    private int numerator;
    private int denominator;

    //default constructor
    public Fraction(){
        numerator = 1;
        denominator = 1;
    }

    //constructor for fraction n/d where n, d > 0
    public Fraction(int n, int d){
        this();
        if(n > 0)
            numerator = n;
        if(d > 0)
            denominator = d;
    }

    //method to return fraction as a String
    public String toString(){
        return numerator + "/" + denominator;
    }

    //method to return fraction as a mixed number String
    public String mixedNumber(){
        if(numerator < denominator)
            return toString();
        if(numerator % denominator == 0)
            return "" + numerator/denominator;
        return numerator/denominator + " " + numerator % denominator + "/" + denominator;
    }

    //method to add fraction n/d to this Fraction
    public void add(int n, int d){
        if(n > 0 && d > 0){
            numerator = numerator * d + n * denominator;
            denominator *= d;
        }
    }
}
