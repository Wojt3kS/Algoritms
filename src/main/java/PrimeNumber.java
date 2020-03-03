import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean invalidNumber = true;
        boolean prime = true;
        while (invalidNumber)
        try{
            number = Integer.parseInt(scanner.nextLine());
            invalidNumber = false;
        } catch (Exception e){
            System.out.println("Invalid number");
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                prime = false;
            }
        }
        System.out.println("Given number is prime: " + prime);
    }
}
