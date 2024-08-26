import java.util.Scanner;

public class UniformAcceleration {
    /*
     *   Write a program that takes three doubl e valuesx0, v0, and tfrom
     * the command line and prints the value of x0 + v0t + gt2/2, where g is the constant 9.78033.
     * (Note: This value the displacement in meters after t seconds when an object is
     * thrown straight up from initial position x0 at velocity v0 meters per second.)
     *
     * */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double xo = input.nextDouble();
        double vo = input.nextDouble();
        double t = input.nextDouble();

        double x = xo + vo*t + (9.78033*t*t)/2.0;

        System.out.println(x);
    }

}
