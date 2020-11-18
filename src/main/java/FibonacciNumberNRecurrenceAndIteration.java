public class FibonacciNumberNRecurrenceAndIteration extends Object{

    public static void main(String[] args) {
        test("recurrence");
        test("iteration");
    }

    public static void test(String type) {
        if (type.equalsIgnoreCase("recurrence")) {
            System.out.print("Recurrence:");
        } else if (type.equalsIgnoreCase("iteration")) {
            System.out.print("Iteration:");
        } else {
            System.out.println("Wrong type");
            return;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0) {
                double timeSinceStarted = ((double) System.currentTimeMillis() - (double) startTime) / 1000;
                System.out.println();
                System.out.println(i + " < i < " + (i + 10) + " Time since started " + timeSinceStarted + "s");
            }
            if (type.equalsIgnoreCase("recurrence")) {
                System.out.print(calculateFibonacciNumberNRecurrence(i) + ", ");
            } else {
                System.out.print(calculateFibonacciNumberNIteration(i) + ", ");
            }
        }
        double timeSinceStarted = ((double) System.currentTimeMillis() - (double) startTime) / 1000;
        System.out.println();
        System.out.println("Total time since started " + timeSinceStarted + "s");
    }


    public static long calculateFibonacciNumberNRecurrence(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return calculateFibonacciNumberNRecurrence(n - 1) + calculateFibonacciNumberNRecurrence(n - 2);
        }
    }

    public static long calculateFibonacciNumberNIteration(int n) {
        if (n == 0) {
            return 0;
        }
        long[] fibonacciNumbers = new long[n + 1];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;
        for (int i = 2; i <= n ; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }
        return fibonacciNumbers[n];
    }
}
