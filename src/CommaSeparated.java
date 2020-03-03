import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaSeparated {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 7, 9, 78, 2378764, 1, 54, 77);
        List<String> strings = new ArrayList<>();
        String answer = "";
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) % 2 == 0){
                strings.add("e");
            } else {
                strings.add("o");
            }
        }
        for (int i = 0; i < integers.size(); i++) {
            answer += strings.get(i);
            answer += integers.get(i);
            answer += ",";
        }
        System.out.println(answer);

        String collect = integers.stream().map(i -> i % 2 == 0 ? "e" + i : "o" + i).collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
