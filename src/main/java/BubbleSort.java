import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 7, 9, 78, 2378764, 1, 54, 77);
        boolean changeMade = true;
        while (changeMade){
            changeMade = false;
            for (int i = 0; i < integers.size() - 1; i++) {
                if (integers.get(i) > integers.get(i + 1)){
                    int tmp = integers.get(i);
                    integers.set(i, integers.get(i + 1));
                    integers.set(i + 1, tmp);
                    changeMade = true;
                }
            }
            System.out.println(integers.toString());
        }
    }
}
