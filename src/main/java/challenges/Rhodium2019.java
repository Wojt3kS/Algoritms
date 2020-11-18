package challenges;

import java.util.ArrayList;

public class Rhodium2019 {

    public int solution1(int[] T) {
        int numberOfPossibilities = 0;
        int [][] connections = new int[T.length][T.length];
        for (int i = 0; i < T.length; i++) {
            connections[i][i] = 1;
            connections[i][T[i]] = 1;
            connections[T[i]][i] = 1;
        }
        for (int i = 0; i < T.length; i++) {
            int maxTripIndex = i;
            int actualIndex = i;
            while(true){
                if(connections[actualIndex][maxTripIndex] == 1){
                    maxTripIndex++;
                    actualIndex = i;
                    if (maxTripIndex > T.length - 1){
                        break;
                    }
                } else if (maxTripIndex - 1 > actualIndex){
                    actualIndex++;
                } else {
                    break;
                }
            }
            numberOfPossibilities+= maxTripIndex - i;
        }
        return numberOfPossibilities;
    }

//    public int solution2(int[] T) {
//        int length = T.length;
//        int numberOfTrips = 0;
//        for (int i = 0; i < length; i++) {
//            int[] bad = new int[length];
//            int badCount = 1;
//            if (T[i] != i){
//                bad[T[i]] = 1;
//            }
//        }
//    }

    public static void main(String[] args) {
        Rhodium2019 rhodium2019 = new Rhodium2019();
        int[] T = {2, 2, 2};
        System.out.println(rhodium2019.solution1(T));
    }
}
