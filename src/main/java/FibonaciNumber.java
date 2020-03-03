import java.util.Scanner;

public class FibonaciNumber {

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
        int fibonaciA = 0, fibonaciB = 1, chosenFibonaci = 0;
        for (int i = 2; i <= number; i++) {
            if (i % 2 == 0){
                fibonaciA = fibonaciA + fibonaciB;
            } else {
                fibonaciB = fibonaciA + fibonaciB;
            }
        }
        if (fibonaciA > fibonaciB || number == 0) {
            chosenFibonaci = fibonaciA;
        } else {
            chosenFibonaci = fibonaciB;
        }
        System.out.println("Chosen fibonaci: " + chosenFibonaci);
    }
}
