public class CesarCipher {

    public static void main(String[] args) {
        String code = "inventive";
        int rotation = 5;
        int lastAlphabet = 'z';
        int alphabetLength = 'z' - 'a' + 1;
        String decoded = "";
        for(char letter: code.toCharArray()){
            int newValue = letter + rotation;
            if (newValue > lastAlphabet){
                newValue = newValue - alphabetLength;
            }
            decoded += (char) newValue;
        }
        System.out.println(decoded);
    }
}
