// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils{
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static int factorial(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Cannot do Factorial with negative numnbers!");
        } else if (n > 16){
            throw new IllegalArgumentException("Factorials is defined within the range from 0 to 16!");
        }

        int fac = 1;
        for (int i=n; i>0; i--)
            fac *= i;
        return fac;
    }
}