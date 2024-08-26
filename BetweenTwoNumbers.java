import java.util.Scanner;

public class BetweenTwoNumbers {
    /*
     *   Write a program that takes two i nt values a and b from the command line
     * and prints a random integer between a and b
     *
     * */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        int min = Math.min(x, y);
        int max = Math.max(x, y);

        int random = min + (int) (Math.random() * ((max - min) + 1));

        System.out.println(random);
    }

}
