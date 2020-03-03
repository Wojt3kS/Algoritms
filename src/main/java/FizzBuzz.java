public class FizzBuzz {

    public static void main (String args[]){
        for (int i = 1; i <=  100; i++) {
            String answear = "";
            if (i % 3 == 0){
                answear += "Fizz";
            }
            if (i % 5 == 0){
                answear += "Buzz";
            }
            if (answear.length() == 0){
                answear = i + "";
            }
            System.out.println(answear);
        }
    }
}
