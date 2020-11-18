import java.sql.SQLOutput;

public class AssecoCodility1 {

    public static void main(String[] args) {
        AssecoCodility1 assecoCodility1 = new AssecoCodility1();
        System.out.println("1");
        System.out.println(assecoCodility1.solution("Codility We test coders", 14));
        System.out.println("2");
        System.out.println(assecoCodility1.solution("Why not", 100));
        System.out.println("3");
        System.out.println(assecoCodility1.solution("The quick brown fox jumps over the lazy dog", 39));
    }

    public String solution(String message, int K) {
        char[] messageChars = message.toCharArray();
        if (K >= messageChars.length) {
            K = messageChars.length;
        } else  if (messageChars[K] != ' '){
            for (int i = K - 1; i >= 0; i--) {
                if (messageChars[i] != ' ') {
                    K--;
                } else {
                    K--;
                    break;
                }
            }
        }
        String answer = "";
        for (int i = 0; i < K; i++) {
            answer += messageChars[i];
        }
        return answer;
    }

}
