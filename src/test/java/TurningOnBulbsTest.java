import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class TurningOnBulbsTest {

    private static int[] test1;
    private static int[] test2;
    private static int[] test3;
    private static int[] test4;
    private static int[] test5;
    private static TurningOnBulbs turningOnBulbs = new TurningOnBulbs();

    @BeforeClass
    public static void setUp(){
        test1 = createTest(100000000);
        test2 = createTest(100000000);
        test3 = createTest(100000000);
        test4 = createTest(100000000);
        test5 = createTest(100000000);
    }

    private static int[] createTest(int arrayLength){
        int[] array = new int[arrayLength];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
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

//    @Test
//    public void solution1Test1(){
//        System.out.println(new Object() {
//        }.getClass().getEnclosingMethod().getName());
//        int answer = turningOnBulbs.solution(test1);
//        System.out.println("Got: " + answer);
//        assertEquals(1000, answer);
//    }
//
//    @Test
//    public void solution1Test2(){
//        System.out.println(new Object() {
//        }.getClass().getEnclosingMethod().getName());
//        int answer = turningOnBulbs.solution(test2);
//        System.out.println("Got: " + answer);
//        assertEquals(1000, answer);
//    }
//
//    @Test
//    public void solution1Test3(){
//        System.out.println(new Object() {
//        }.getClass().getEnclosingMethod().getName());
//        int answer = turningOnBulbs.solution(test3);
//        System.out.println("Got: " + answer);
//        assertEquals(1000, answer);
//    }
//
//    @Test
//    public void solution1Test4(){
//        System.out.println(new Object() {
//        }.getClass().getEnclosingMethod().getName());
//        int answer = turningOnBulbs.solution(test4);
//        System.out.println("Got: " + answer);
//        assertEquals(1000, answer);
//    }
//
//    @Test
//    public void solution1Test5(){
//        System.out.println(new Object() {
//        }.getClass().getEnclosingMethod().getName());
//        int answer = turningOnBulbs.solution(test5);
//        System.out.println("Got: " + answer);
//        assertEquals(1000, answer);
//    }

    @Test
    public void solution2Test1(){
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        int answer = turningOnBulbs.solution2(test1);
        System.out.println("Got: " + answer);
        assertEquals(1000, answer);
    }

    @Test
    public void solution2Test2(){
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        int answer = turningOnBulbs.solution2(test2);
        System.out.println("Got: " + answer);
        assertEquals(1000, answer);
    }

    @Test
    public void solution2Test3(){
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        int answer = turningOnBulbs.solution2(test3);
        System.out.println("Got: " + answer);
        assertEquals(1000, answer);
    }

    @Test
    public void solution2Test4(){
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        int answer = turningOnBulbs.solution2(test4);
        System.out.println("Got: " + answer);
        assertEquals(1000, answer);
    }

    @Test
    public void solution2Test5(){
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        int answer = turningOnBulbs.solution2(test5);
        System.out.println("Got: " + answer);
        assertEquals(1000, answer);
    }

    @Test
    public void solution3Test1(){
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        int answer = turningOnBulbs.solution3(test1);
        System.out.println("Got: " + answer);
        assertEquals(1000, answer);
    }

    @Test
    public void solution3Test2(){
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        int answer = turningOnBulbs.solution3(test2);
        System.out.println("Got: " + answer);
        assertEquals(1000, answer);
    }

    @Test
    public void solution3Test3(){
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        int answer = turningOnBulbs.solution3(test3);
        System.out.println("Got: " + answer);
        assertEquals(1000, answer);
    }

    @Test
    public void solution3Test4(){
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        int answer = turningOnBulbs.solution3(test4);
        System.out.println("Got: " + answer);
        assertEquals(1000, answer);
    }

    @Test
    public void solution3Test5(){
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        int answer = turningOnBulbs.solution3(test5);
        System.out.println("Got: " + answer);
        assertEquals(1000, answer);
    }

}