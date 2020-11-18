import java.util.Arrays;

public class MaxCounters {

    public int[] solution1(int N, int[] A) {
        int[] counters = new int[N];
        int maxCounter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                for (int j = 0; j < counters.length; j++) {
                    counters[j] = maxCounter;
                }
            } else {
                counters[A[i] - 1]++;
                maxCounter = Math.max(maxCounter, counters[A[i] - 1]);
            }
        }
        return counters;
    }

    public int[] solution2(int N, int[] A) {
        int[] counters = new int[N];
        int maxCounter = 0;
        int numberToAdd = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                numberToAdd += maxCounter;
                counters = new int[N];
                maxCounter = 0;
            } else {
                counters[A[i] - 1]++;
                maxCounter = Math.max(maxCounter, counters[A[i] - 1]);
            }
        }
        for (int i = 0; i < counters.length; i++) {
            counters[i] += numberToAdd;
        }
        return counters;
    }

    public int[] solution3(int N, int[] A) {
        int[] counters = new int[N];
        int maxCounter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                Arrays.fill(counters, maxCounter);
            } else {
                counters[A[i] - 1]++;
                maxCounter = Math.max(maxCounter, counters[A[i] - 1]);
            }
        }
        return counters;
    }

    public int[] solution4(int N, int[] A) {
        int[] counters = new int[N];
        int maxCounter = 0;
        int numberToAdd = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                numberToAdd += maxCounter;
                maxCounter = 0;
            } else {
                if (counters[A[i] - 1] >= numberToAdd) {
                    counters[A[i] - 1]++;
                    maxCounter = Math.max(maxCounter, counters[A[i] - 1] - numberToAdd);
                } else {
                    counters[A[i] - 1] = numberToAdd + 1;
                    maxCounter = Math.max(maxCounter, counters[A[i] - 1] - numberToAdd);
                }
            }
        }
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < numberToAdd) {
                counters[i] = numberToAdd;
            }
        }
        return counters;
    }

}
