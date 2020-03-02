import java.util.ArrayList;
import java.util.List;

public class OddPairs {

    public static void main(String[] args) {
        int [] ints = {2, 5, 8, 9, 11, 13};
        OddPairs oddPairs = new OddPairs();
        System.out.println(oddPairs.solution(ints));
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
}
