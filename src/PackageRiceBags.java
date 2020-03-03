public class PackageRiceBags {
    public static void main(String[] args) {
        int big = 5, small = 4, goal = 24;
        boolean possible;
        while (big > 0 && goal > 4){
            big--;
            goal-=5;
        }
        while (small > 0 && goal > 0){
            small--;
            goal--;
        }
        if (goal == 0){
            System.out.println("It is possible to make package with goal kilo of rice");
        } else {
            System.out.println("It is impossible to make package with goal kilo of rice");

        }
    }
}
