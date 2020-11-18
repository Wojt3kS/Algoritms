import java.util.Arrays;

public class MissingInteger {

    public int solution(int[] A) {
        Arrays.sort(A);
        int minInt = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == minInt) {
                minInt++;
            } else if (A[i] > minInt) {
                return minInt;
            }
        }
        return minInt;
    }

    public static void main(String[] args) {
        MissingInteger missingInteger = new MissingInteger();
        int[] numbers = {100, 7, 4, 2, 6, 3, 1, 5, 10, 8, 9, 12};
        System.out.println(missingInteger.solution(numbers));
    }

}
