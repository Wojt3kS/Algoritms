public class FrogRiverOne {

    public int solution(int X, int[] A) {
        int[] availableAtSecond = new int[X + 1];
        for (int i = 0; i < A.length; i++) {
            if (availableAtSecond[A[i]] == 0) {
                if (i != 0) {
                    availableAtSecond[A[i]] = i;
                } else {
                    availableAtSecond[A[i]] = -1;
                }
            }
        }
        int maxSecond = 0;
        for (int i = 1; i < availableAtSecond.length; i++) {
            maxSecond = Math.max(maxSecond, availableAtSecond[i]);
            if (availableAtSecond[i] == 0) {
                return -1;
            }
        }
        return maxSecond;
    }
}
