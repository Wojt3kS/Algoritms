public class CountDiv {
    public int solution(int A, int B, int K) {
        while(true){
            if (A % K == 0){
                break;
            }
            A++;
        }
        while(true){
            if (B % K == 0){
                break;
            }
            B--;
        }
        int result = (B - A) / K + 1;
        if (result > 0){
            return result;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        CountDiv countDiv = new CountDiv();
        System.out.println(countDiv.solution(6, 11, 2));
    }
}
