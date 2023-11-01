package homework1.task1;


public class Calculator {


    public static double calculateDiscount(double purchaseAmount, double discountAmount) {
        return purchaseAmount - purchaseAmount * (discountAmount / 100);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return (double) a / b;
    }
}
