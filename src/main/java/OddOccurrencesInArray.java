import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class OddOccurrencesInArray {

    public int solution1a(int[] A) {
        int result = -1;
        boolean[] paired = new boolean[A.length];
        for (int i = 0; i < A.length; i++) {
            if (paired[i]){
                continue;
            }
            int current = A[i];
            for (int j = i + 1; j < A.length; j++) {
                if (current == A[j] && !paired[j]){
                    paired[i] = true;
                    paired[j] = true;
                    break;
                }
            }
        }
        for (int i = 0; i < paired.length; i++) {
            if (!paired[i]){
                result = A[i];
            }
        }
        return result;
    }

    public int solution1b(int[] A) {
        int result = -1;
        boolean[] paired = new boolean[A.length];
        for (int i = 0; i < A.length; i++) {
            if (paired[i]){
                continue;
            }
            int current = A[i];
            for (int j = i + 1; j < A.length; j++) {
                if (current == A[j] && !paired[j]){
                    paired[i] = true;
                    paired[j] = true;
                    break;
                }
                if(j == A.length - 1){
                    return current;
                }
            }
        }
        for (int i = 0; i < paired.length; i++) {
            if (!paired[i]){
                result = A[i];
            }
        }
        return result;
    }

    public int solution2a(int[] A) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            numbers.add(A[i]);
        }
        while(numbers.size() > 1){
            int current = numbers.get(0);
            for (int i = 1; i < numbers.size(); i++) {
                if (numbers.get(i) == current){
                    numbers.remove(i);
                    numbers.remove(0);
                    break;
                }
                if(i == numbers.size() - 1){
                    return current;
                }
            }
        }
        return numbers.get(0);
    }

    public int solution3a(int [] A) {
        int[] numberOfOccurrences = new int[1000000001];
        for (int i = 0; i < A.length; i++) {
            numberOfOccurrences[A[i]]++;
        }
        for (int i = 0; i < numberOfOccurrences.length; i++) {
            if(numberOfOccurrences[i] % 2 != 0){
                return i;
            }
        }
        return -1;
    }

    public int solution4a(int [] A){
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i+=2) {
            if (A[i] != A[i + 1]){
                return A[i];
            }
        }
        return A[A.length - 1];
    }

    public int solution4b(int [] A){
        Arrays.sort(A);
        int max2Power = 1;
        while(max2Power < A.length){
            max2Power *= 2;
        }
        max2Power /= 2;
        int currentIndex = A.length;
        currentIndex = currentIndex - max2Power -1;
        while(true) {
            max2Power /= 2;
            if(A[currentIndex] == A[currentIndex + 1]){
                currentIndex += max2Power;
            } else if (A[currentIndex - 1] == A[currentIndex]) {
                currentIndex -= max2Power;
            } else {
                return A[currentIndex];
            }
            if (currentIndex < 0){
                currentIndex = - currentIndex;
            }
        }
    }
}

