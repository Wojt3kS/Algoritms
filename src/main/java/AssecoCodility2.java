import java.util.HashMap;
import java.util.Map;

public class AssecoCodility2 {

    public static void main(String[] args) {

    }

    Map<Long, Long> count(Map<String, UserStats>... visits) {
        Map<Long, Long> map = new HashMap<>();
        if (visits == null){
            return map;
        }
        for (int i = 0; i < visits.length; i++) {
            try {
                String key = "";
                for (String string : visits[i].keySet()) {
                    key = string;
                }
                long numberKey = Long.parseLong(key);
                long visitsCount = visits[i].get(key).getVisitCount().get();
                if (map.get(numberKey) == null){
                    map.put(numberKey, visitsCount);
                } else {
                    long existingVisitsCount = map.get(numberKey);
                    map.put(numberKey, visitsCount + existingVisitsCount);
                }


            } catch (Exception e) {
                continue;
            }
        }

        return map;
    }
}
