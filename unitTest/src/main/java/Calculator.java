public final class Calculator {
    public Calculator() {
    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int multiply(int multiplicand, int multiplier) {
        return multiplicand * multiplier;
    }

    public static double divide(int dividend, int divisor) {
        if (divisor == 0)
            throw new IllegalArgumentException("Cannot divide by zero (0).");
        return dividend / divisor;
    }

    public static double[] Quadratic(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        double x1, x2;
        double[] resultsTwo = new double[2];
        double[] resultsOne = new double[1];
        if (a == 0) {
            if (b == 0) return null;
            if (b != 0) {
                resultsOne[0] = -c / b;
                return resultsOne;
            }

        }
        if (a != 0) {
            if (delta > 0) {
                x1 = ((-b) - Math.sqrt(delta)) / (2 * a);
                x2 = ((-b) + Math.sqrt(delta)) / (2 * a);
                resultsTwo[0] = x1;
                resultsTwo[1] = x2;
                return resultsTwo;
            } else if (delta == 0) {
                x1 = (-b) / (2 * a);
                resultsOne[0] = x1;
                return resultsOne;
            } else {
                return null;
            }
        }
        return resultsOne;
    }
}
