import java.util.ArrayList;
import java.util.List;

public class OddPairs {

    public static void main(String[] args) {
        int [] ints = {2, 5, 8, 9, 11, 13};
        OddPairs oddPairs = new OddPairs();
        System.out.println(oddPairs.solution2(ints));
    }

    public boolean solution(int[] A) {

        List<Integer> pairs = new ArrayList<>();
        for (int value : A) {
            pairs.add(value);
        }
        boolean pairDetected = true;
        while (pairDetected && pairs.size() > 0){
            pairDetected = false;
            int toPair = pairs.get(0);
            pairs.remove(0);
            for (int i = 0; i < pairs.size(); i++) {
                if ((pairs.get(i) + toPair) % 2 != 0){
                    pairs.remove(i);
                    pairDetected = true;
                    break;
                }
            }
        }
        return pairs.size() == 0;
    }

    public boolean solution2(int[] A) {
        if (A.length % 2 != 0){
            return false;
        }
        int numberOfOdds = 0;
        int numberOfEvens = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0){
                numberOfEvens++;
            } else {
                numberOfOdds++;
            }
        }
        return numberOfEvens == numberOfOdds;
    }
}
