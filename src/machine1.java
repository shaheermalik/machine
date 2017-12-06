import javax.swing.*;

public class machine1 {
    public static void main(String [] args) {
        int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Please put in an integer into the machine!"));
        JOptionPane.showMessageDialog(null, input + " to the tenth power is " + tenthPow(input));

        int input2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Time to input another integer!"));
        JOptionPane.showMessageDialog(null, input + " + " + input2 + " = " + add(input, input2));

        int input3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Okay one final integer input!"));
        JOptionPane.showMessageDialog(null, "(The square root of " + input + ") + ( the absolute value of " + input2 + ") + (" + input3 + " to the  " + input2 + " power) = " + customFunction(input, input2, input3));

    }

    public static int tenthPow(int x) {
        return (x*x*x*x*x*x*x*x*x*x);
    }

    public static int add(int x, int y) {
        return(x + y);

    }
    public static double pow(double base, double exponent) {
        double power = 1.0;
        for (double i = exponent; i > 0; i--) {
            power *= base;

        }
        return (power);
    }

    public static double root(int x) {
        return Math.sqrt(x);
    }




    public static double abs(double y) {
        return ((y >= 0) ? y : (y * -1));
    }

    public static int customFunction(int x, int y , int z) {
        return (int) (root(x) + abs(y) + pow(z, y));
    }

}

