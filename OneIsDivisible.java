import java.util.Scanner;

public class OneIsDivisible {
    /*
     *  Write a program that takes two positive integers as command-line
     * arguments and prints true if either evenly divides the other.
     *
     * */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        boolean isDivisible = x%y == 0 || y%x == 0;

        System.out.println(isDivisible);
    }

}
