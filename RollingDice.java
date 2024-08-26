import java.util.Scanner;

public class RollingDice {
    /*
     *    Write a program that prints the sum of two random integers between 1 and
     * 6 (such as you might get when rolling dice).
     *
     * */
    
    public static void main(String[] args) {

        int value1 = (int) (Math.random() * 6) + 1;
        int value2 = (int) (Math.random() * 6) + 1;

        System.out.println(value1 + value2);
    }

}
