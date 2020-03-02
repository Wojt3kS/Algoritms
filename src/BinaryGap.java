public class BinaryGap {

    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        int solution = binaryGap.solution(137);
        System.out.println(solution);
    }

    public int solution(int N) {
        long maxBinary = 1;
        String nBinary = "";
        while (maxBinary < N) {
            maxBinary *= 2;
        }
        while (maxBinary > 0) {
            if (N - maxBinary >= 0) {
                N -= maxBinary;
                maxBinary /= 2;
                nBinary += "1";
            } else {
                maxBinary /= 2;
                if (!"".equals(nBinary)){
                    nBinary += "0";
                }
            }

        }
        char[] nChars = nBinary.toCharArray();
        int maxGap = 0;
        int tmpGap = 0;
        for (int i = 0; i < nChars.length; i++) {
            if (nChars[i] == '0'){
                tmpGap++;
            } else {
                if (tmpGap > maxGap){
                    maxGap = tmpGap;
                }
                tmpGap = 0;
            }
        }
        return maxGap;
    }
}
