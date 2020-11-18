import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class PermMissingElemTest {

    private static int[] test1;
    private static int test1Answer;
    private static int[] test2;
    private static int test2Answer;
    private static int[] test3;
    private static int test3Answer;
    private static int[] test4;
    private static int test4Answer;
    private static int[] test5;
    private static int test5Answer;

    private static int tmpAnswer;

    private PermMissingElem permMissingElem = new PermMissingElem();

    @BeforeClass
    public static void setUp(){
        test1 = createTest(100000);
        test1Answer = tmpAnswer;
        test2 = createTest(100000);
        test2Answer = tmpAnswer;
        test3 = createTest(100000);
        test3Answer = tmpAnswer;
        test4 = createTest(100000);
        test4Answer = tmpAnswer;
        test5 = createTest(100000);
        test5Answer = tmpAnswer;
    }

    @Test
    public void test1(){
        int answer = permMissingElem.solution(test1);
        assertEquals(test1Answer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + test1Answer + "\nGot: " + answer);
    }

    @Test
    public void test2(){
        int answer = permMissingElem.solution(test2);
        assertEquals(test2Answer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + test2Answer + "\nGot: " + answer);
    }

    @Test
    public void test3(){
        int answer = permMissingElem.solution(test3);
        assertEquals(test3Answer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + test3Answer + "\nGot: " + answer);
    }

    @Test
    public void test4(){
        int answer = permMissingElem.solution(test4);
        assertEquals(test4Answer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + test4Answer + "\nGot: " + answer);
    }

    @Test
    public void test5(){
        int answer = permMissingElem.solution(test5);
        assertEquals(test5Answer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + test5Answer + "\nGot: " + answer);
    }

    private static int[] createTest(int arrayLength){
        int[] array = new int[arrayLength];
        Random r = new Random();
        tmpAnswer = r.nextInt(arrayLength) + 1;
        for (int i = 0; i < array.length; i++) {
            if (i + 1 != tmpAnswer){
                array[i] = i + 1;
            } else {
                array[i] = arrayLength + 1;
            }
        }
        for (int i = 0; i < 1000000; i++) {
            int firstIndex = r.nextInt(arrayLength);
            int secondIndex = r.nextInt(arrayLength);
            int tmp = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = tmp;
        }
        return array;
    }

}