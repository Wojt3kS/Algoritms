public class TapeEquilibrium {

    public int solution1(int[] A) {
        int minDifference = Integer.MAX_VALUE;
        for (int i = 1; i < A.length; i++) {
            int lowerSum = 0;
            int higherSum = 0;
            for (int j = 0; j < i; j++) {
                lowerSum += A[j];
            }
            for (int j = i; j < A.length; j++) {
                higherSum += A[j];
            }
            int difference = higherSum - lowerSum;
            if (difference < 0) {
                difference = -difference;
            }
            minDifference = Math.min(minDifference, difference);
        }
        return minDifference;
    }

    public int solution2(int[] A) {
        int[] lowerSum = new int[A.length];
        int[] higherSum = new int[A.length];
        int actualLowerSum = 0;
        int actualHigherSum = 0;
        for (int i = 0; i < lowerSum.length - 1; i++) {
            actualLowerSum += A[i];
            lowerSum[i + 1] = actualLowerSum;
        }
        for (int i = higherSum.length - 1; i > 0; i--) {
            actualHigherSum += A[i];
            higherSum[i] = actualHigherSum;
        }
        int minDifference = Integer.MAX_VALUE;
        for (int i = 1; i < A.length; i++) {
            int difference = higherSum[i] - lowerSum[i];
            if (difference < 0) {
                difference = -difference;
            }
            minDifference = Math.min(minDifference, difference);
        }
        return minDifference;
    }

    public static void main(String[] args) {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int[] array = {3, 1, 2, 4, 3};
        System.out.println(tapeEquilibrium.solution2(array));
    }
}
