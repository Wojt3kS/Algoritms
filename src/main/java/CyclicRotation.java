public class CyclicRotation {

    public static void main(String[] args) {
        int [] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int K = 4;
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] solution = cyclicRotation.solution(ints, K);
        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i] + ", ");
        }
    }

    public int[] solution(int[] A, int K) {
        int[] aCopy = new int [A.length];
        for (int i = 0; i < A.length; i++) {
            aCopy[i] = A[i];
        }
        K = K % A.length;
        for (int i = 0; i < A.length - K; i++) {
            A[i + K] = aCopy[i];
        }
        for (int i = 0; i < K; i++) {
            A[i] = aCopy[i + A.length - K];
        }
        return A;
    }
}
