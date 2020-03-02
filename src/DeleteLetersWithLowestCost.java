import java.util.ArrayList;
import java.util.List;

public class DeleteLetersWithLowestCost {

    public static void main(String[] args) {
        int[] ints = {5, 4, 3, 2, 1, 7, 8};
        String s = "accbaaa";
        DeleteLetersWithLowestCost deleteLetersWithLowestCost = new DeleteLetersWithLowestCost();
        System.out.println(deleteLetersWithLowestCost.solution(s, ints));
    }

    public int solution(String S, int[] C) {

        List<Character> characters = new ArrayList<>();
        List<Integer> costs = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            characters.add(S.charAt(i));
        }
        for (int i = 0; i < C.length; i++) {
            costs.add(C[i]);
        }
        int costsSum = 0;
        for (int i = 0; i < characters.size() - 1; i++) {
            if (characters.get(i) == characters.get(i + 1)) {
                characters.remove(i);
                if (costs.get(i) > costs.get(i + 1)) {
                    costsSum += costs.get(i + 1);
                    costs.remove(i + 1);
                } else {
                    costsSum += costs.get(i);
                    costs.remove(i);
                }
                i--;
            }
        }

        return costsSum;
    }
}
