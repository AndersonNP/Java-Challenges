import java.util.Scanner;

public class CalcSins {
    /*
     *   Write a program that takes a double value t from the command line and
     * prints the value of sin(2t) + sin(3t)
     *
     * */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();

        double result = Math.sin(2*x) + Math.sin(3*x);

        System.out.println(result);
    }

}
