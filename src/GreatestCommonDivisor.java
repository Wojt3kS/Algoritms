import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = 0, q = 0, greatestDivisor = 0;
        boolean invalidNumber = true;
        while (invalidNumber) {
            try {
                p = Integer.parseInt(scanner.nextLine());
                invalidNumber = false;
            } catch (Exception e) {
                System.out.println("Invalid number");
            }

        }
        invalidNumber = true;
        while (invalidNumber) {
            try {
                q = Integer.parseInt(scanner.nextLine());
                invalidNumber = false;
            } catch (Exception e) {
                System.out.println("Invalid number");
            }
        }
        for (int i = 1; i <= Math.min(p, q); i++) {
            if (p % i == 0 && q % i == 0) {
                greatestDivisor = i;
            }
        }
        System.out.println("Greatest common divisor for " + p + " and " + q + " is " + greatestDivisor);
    }
}
