public class LargestPrimeFactor {

    public static void main(String[] args) {
        int number = 680225;
        int largestPrimeFactor = 1;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                number = number / i;
                largestPrimeFactor = i;
                i--;
            }
        }
        System.out.println("Largest prime factor is: " + largestPrimeFactor);
    }
}
