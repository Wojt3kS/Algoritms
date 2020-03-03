public class Palindrome {

    public static void main(String[] args) {
        String palindrome = "Madam, I'm Adam";
        palindrome = palindrome.toLowerCase();
        char[] palindromeChar = palindrome.toCharArray();
        palindrome = "";
//      97a 122z
        for (int i = 0; i < palindromeChar.length; i++) {
            if (palindromeChar[i] > 96 && palindromeChar[i] < 123){
                palindrome += palindromeChar[i];
            }
        }
        int palindromeLength = palindrome.length();
        boolean palindromeResult = true;
        for (int i = 0; i < palindromeLength; i++) {
            if (!(palindrome.charAt(i) == palindrome.charAt(palindromeLength -1 ))){
                palindromeResult = false;
                break;
            }
            palindromeLength--;
        }
        System.out.println("String is palindrome: " + palindromeResult);
    }
}
