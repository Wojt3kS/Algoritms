import java.util.ArrayList;
import java.util.List;

public class TurningOnBulbs {

    public static void main(String[] args) {
        int[] ints = {1, 6, 5, 2, 7, 3, 4};
        TurningOnBulbs turningOnBulbs = new TurningOnBulbs();
        System.out.println(turningOnBulbs.solution(ints));
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
}
