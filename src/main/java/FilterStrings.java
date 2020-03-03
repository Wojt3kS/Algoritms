import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStrings {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Awsome", "aba", "case", "mother", "hard-working", "idle", "accurate", "Archer", "inventive", "angry", "ana", "Ana");
        List<String> selectedStrings = strings.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
        System.out.println(selectedStrings.toString());

    }
}
