import java.util.ArrayList;
import java.util.List;

public class TurningOnBulbs {

    public static void main(String[] args) {
        int[] ints = {1, 6, 5, 2, 7, 3, 4};
        TurningOnBulbs turningOnBulbs = new TurningOnBulbs();
        System.out.println("Solution 1: " + turningOnBulbs.solution(ints));
        System.out.println("Solution 2: " + turningOnBulbs.solution2(ints));
        System.out.println("Solution 3: " + turningOnBulbs.solution3(ints));
    }

    public int solution(int[] A) {
        int numberOfMoments = 0;
        for (int i = 0; i < A.length; i++) {
            int actual = A[i];
            List<Integer> previousNumbers = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (A[j] < actual) {
                    previousNumbers.add(A[i]);
                }
            }
            if (actual - 1 == previousNumbers.size()) {
                numberOfMoments++;
            }
        }
        return numberOfMoments;
    }

    public int solution2(int[] A) {
        int numberOfMoments = 0;
        boolean[] numbersFound = new boolean[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            numbersFound[A[i]] = true;
            if (A[i] > i + 1) {
                continue;
            }
            boolean isValidMoment = true;
            for (int j = 1; j < A[i]; j++) {
                if (!numbersFound[j]) {
                    isValidMoment = false;
                    break;
                }
            }
            if (isValidMoment) {
                numberOfMoments++;
            }
        }
        return numberOfMoments;
    }

    public int solution3(int[] A) {
        int numberOfMoments = 0;
        boolean[] numbersFound = new boolean[A.length + 1];
        int numberToFind = 1;
        for (int i = 0; i < A.length; i++) {
            numbersFound[A[i]] = true;
            if (A[i] > numberToFind) {
                continue;
            }
            if (A[i] == numberToFind) {
                for (int j = numberToFind; j < numbersFound.length; j++) {
                    if (!numbersFound[j]) {
                        numberToFind = j;
                        break;
                    }
                }
            }
            numberOfMoments++;
        }
        return numberOfMoments;
    }
}
