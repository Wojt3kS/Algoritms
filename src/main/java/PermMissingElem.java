import java.util.Arrays;

public class PermMissingElem {

    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1){
                return i + 1;
            }
        }
        if (A.length == 0){
            return 1;
        } else {
            return A.length + 1;
        }
    }
}
