import java.util.ArrayList;
import java.util.List;

public class DeleteLettersWithLowestCost {

    public static void main(String[] args) {
        int[] ints = {5, 4, 3, 2, 1, 7, 8};
        String s = "accbaaa";
        DeleteLettersWithLowestCost deleteLettersWithLowestCost = new DeleteLettersWithLowestCost();
        System.out.println(deleteLettersWithLowestCost.solution2(s, ints));
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

    public int solution2(String S, int[] C) {
        int costsSum = 0;
        char letterToCompare = S.charAt(0);
        int indexOfLetterToCompare = 0;
        for (int i = 1; i < C.length; i++) {
            if (letterToCompare == S.charAt(i)) {
                if (C[indexOfLetterToCompare] > C[i]){
                    costsSum += C[i];
                } else {
                    costsSum += C[indexOfLetterToCompare];
                    indexOfLetterToCompare = i;
                }
            } else {
                letterToCompare = S.charAt(i);
                indexOfLetterToCompare = i;
            }
        }
        return costsSum;
    }
}
