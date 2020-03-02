import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ReplacingBooks {

    public static void main(String[] args) {
        int K = 10;
        int [] A = new int[100];
        Random r = new Random();
        for (int i = 0; i < A.length; i++) {
            A[i] = r.nextInt(100) + 1;
        }
        System.out.println("\n" + solution(A, K));
    }

    public static int solution(int[] A, int K) {
        Map<Integer, Integer> scores = new HashMap<>();
        for (int i = 1; i <= 100000; i++) {
            scores.put(i, 0);
        }
        for (int i = 0; i < A.length; i++) {
            scores.put(A[i], scores.get(A[i]) + 1);
        }
        int max = -1;
        int maxKey = -1;
        for (int i = 1; i <= 100000; i++) {
            int currentValue = scores.get(i);
            if (currentValue > max){
                max = currentValue;
                maxKey = i;
            }
        }
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[j] != maxKey){
                    A[j] = maxKey;
                    max++;
                    break;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ", ");
        }
        return max;
    }
}
