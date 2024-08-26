import java.util.Scanner;

public class TrigIdentities {
    /*
     * Write a program that uses Math.si n() and Math. cos () to check that the
     * value of cos2 0 + sin2 6 is approximately 1for any 0 entered as a command-line argument.
     *  Just print the value.
     *
     * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        System.out.println(Math.pow(Math.cos(x),2));

        System.out.println(Math.pow(Math.sin(x),2));

        System.out.println(Math.pow(Math.cos(x),2) + Math.pow(Math.sin(x),2));
    }

}
