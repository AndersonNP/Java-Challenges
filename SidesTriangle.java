import java.util.Scanner;

public class SidesTriangle {
    /*
     *   Write a program that takes three positive integers as command-line
     * arguments and prints t rue if any one of them is greater than or equal to the sum of the
     * other two and false otherwise. (Note: This computation tests whether the three
     * numbers could be the lengths of the sides of some triangle.)
     *
     * */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        boolean sideX = x >= y + z;
        boolean sideY = y >= x + z;
        boolean sideZ = z >= y + x;

        System.out.println(sideX || sideY || sideZ);
    }

}
