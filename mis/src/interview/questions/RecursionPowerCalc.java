/*
 * Recursion program to calculate power 
 */

package interview.questions;

import java.util.Scanner;

public class RecursionPowerCalc {

    public static void main(String[] args) {
        double base;
        int powerRaised;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter base: ");
        base = sc.nextDouble();
        
        System.out.print("Enter power raised: ");
        powerRaised = sc.nextInt();
        
        double result = power(base, powerRaised);

        System.out.println(base+" ^ "+powerRaised + " = "+result);
        sc.close();
    }

    public static double power(double base, int powerRaised) {
        if (powerRaised > 0) {
        	return (base * power(base, powerRaised - 1));
        }
        else if(powerRaised < 0) {
            return (1/base * (power(base, -(Math.abs(powerRaised)-1))));
        }
        else {
        	return 1;
        }
    }
}