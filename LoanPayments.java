import java.util.Scanner;

public class LoanPayments {
    /*
     *    Write a program that calculates the monthly payments
     * you would have to make over a given number of years to pay off a loan at a given
     * interest rate compounded continuously,taking the number of years t,the principal P,
     *  and the annual interest rate r as command-line arguments. The desired value is
     * given by the formula Pen. Use Math. exp().
     *
     * */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double t = input.nextDouble();
        double p = input.nextDouble();
        double r = input.nextDouble();

        double a = p*Math.pow(Math.E,r*t);

        System.out.println(a);
    }

}
