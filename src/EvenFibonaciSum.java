import java.util.Scanner;

public class EvenFibonaciSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean invalidNumber = true;
        while (invalidNumber) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                invalidNumber = false;
            } catch (Exception e) {
                System.out.println("Invalid number");
            }

        }
        int fibonaciA = 0, fibonaciB = 1, sum = 1;
        for (int i = 3; i <= number; i++) {
            if (i % 2 != 0) {
                fibonaciA = fibonaciA + fibonaciB;
                sum += fibonaciA;
            } else {
                fibonaciB = fibonaciA + fibonaciB;
                sum += fibonaciB;
            }
        }
        if (number == 1){
            sum = 0;
        }
        System.out.println("Sum of first " + number + " fibonaci = " + sum);
    }

}
