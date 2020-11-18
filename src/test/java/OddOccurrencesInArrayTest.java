import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class OddOccurrencesInArrayTest {

    private static int[] n100_001Test1;
    private static int n100_001Test1CorrectAnswer;
    private static int n100_001Test1CorrectIndex;

    private static int[] n100_001Test2;
    private static int n100_001Test2CorrectAnswer;
    private static int n100_001Test2CorrectIndex;

    private static int[] n100_001Test3;
    private static int n100_001Test3CorrectAnswer;
    private static int n100_001Test3CorrectIndex;


    private static int[] n999_999Test1;
    private static int n999_999Test1CorrectAnswer;
    private static int n999_999Test1CorrectIndex;

    private static int[] n999_999Test2;
    private static int n999_999Test2CorrectAnswer;
    private static int n999_999Test2CorrectIndex;

    private static int[] n999_999Test3;
    private static int n999_999Test3CorrectAnswer;
    private static int n999_999Test3CorrectIndex;

    private static int tmpCorrectAnswer;
    private static int tmpCorrectIndex;
    private static OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

    @BeforeClass
    public static void setUp() {
        n100_001Test1 = createTestArray(100001);
        n100_001Test1CorrectAnswer = tmpCorrectAnswer;
        n100_001Test1CorrectIndex = tmpCorrectIndex;

        n100_001Test2 = createTestArray(100001);
        n100_001Test2CorrectAnswer = tmpCorrectAnswer;
        n100_001Test2CorrectIndex = tmpCorrectIndex;

        n100_001Test3 = createTestArray(100001);
        n100_001Test3CorrectAnswer = tmpCorrectAnswer;
        n100_001Test3CorrectIndex = tmpCorrectIndex;


        n999_999Test1 = createTestArray(999999);
        n999_999Test1CorrectAnswer = tmpCorrectAnswer;
        n999_999Test1CorrectIndex = tmpCorrectIndex;

        n999_999Test2 = createTestArray(999999);
        n999_999Test2CorrectAnswer = tmpCorrectAnswer;
        n999_999Test2CorrectIndex = tmpCorrectIndex;

        n999_999Test3 = createTestArray(999999);
        n999_999Test3CorrectAnswer = tmpCorrectAnswer;
        n999_999Test3CorrectIndex = tmpCorrectIndex;
    }

    // solution1a
    @Test
    public void n100_000Test1Solution1a() {
        int answer = oddOccurrencesInArray.solution1a(n100_001Test1);
        assertEquals(n100_001Test1CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n100_001Test1CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n100_001Test1CorrectIndex);
    }

    @Test
    public void n100_000Test2Solution1a() {
        int answer = oddOccurrencesInArray.solution1a(n100_001Test2);
        assertEquals(n100_001Test2CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n100_001Test2CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n100_001Test2CorrectIndex);
    }

    @Test
    public void n100_000Test3Solution1a() {
        int answer = oddOccurrencesInArray.solution1a(n100_001Test3);
        assertEquals(n100_001Test3CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n100_001Test3CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n100_001Test3CorrectIndex);
    }

    @Test
    public void n999_999Test1Solution1a() {
        int answer = oddOccurrencesInArray.solution1a(n999_999Test1);
        assertEquals(n999_999Test1CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n999_999Test1CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n999_999Test1CorrectIndex);
    }

    @Test
    public void n999_999Test2Solution1a() {
        int answer = oddOccurrencesInArray.solution1a(n999_999Test2);
        assertEquals(n999_999Test2CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n999_999Test2CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n999_999Test2CorrectIndex);
    }

    @Test
    public void n999_999Test3Solution1a() {
        int answer = oddOccurrencesInArray.solution1a(n999_999Test3);
        assertEquals(n999_999Test3CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n999_999Test3CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n999_999Test3CorrectIndex);
    }

    // solution1b
    @Test
    public void n100_000Test1Solution1b() {
        int answer = oddOccurrencesInArray.solution1b(n100_001Test1);
        assertEquals(n100_001Test1CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n100_001Test1CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n100_001Test1CorrectIndex);
    }

    @Test
    public void n100_000Test2Solution1b() {
        int answer = oddOccurrencesInArray.solution1b(n100_001Test2);
        assertEquals(n100_001Test2CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n100_001Test2CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n100_001Test2CorrectIndex);
    }

    @Test
    public void n100_000Test3Solution1b() {
        int answer = oddOccurrencesInArray.solution1b(n100_001Test3);
        assertEquals(n100_001Test3CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n100_001Test3CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n100_001Test3CorrectIndex);
    }

    @Test
    public void n999_999Test1Solution1b() {
        int answer = oddOccurrencesInArray.solution1b(n999_999Test1);
        assertEquals(n999_999Test1CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n999_999Test1CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n999_999Test1CorrectIndex);
    }

    @Test
    public void n999_999Test2Solution1b() {
        int answer = oddOccurrencesInArray.solution1b(n999_999Test2);
        assertEquals(n999_999Test2CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n999_999Test2CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n999_999Test2CorrectIndex);
    }

    @Test
    public void n999_999Test3Solution1b() {
        int answer = oddOccurrencesInArray.solution1b(n999_999Test3);
        assertEquals(n999_999Test3CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n999_999Test3CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n999_999Test3CorrectIndex);
    }

    // solution2a
    @Test
    public void n100_000Test1Solution2a() {
        int answer = oddOccurrencesInArray.solution2a(n100_001Test1);
        assertEquals(n100_001Test1CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n100_001Test1CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n100_001Test1CorrectIndex);
    }

    @Test
    public void n100_000Test2Solution2a() {
        int answer = oddOccurrencesInArray.solution2a(n100_001Test2);
        assertEquals(n100_001Test2CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n100_001Test2CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n100_001Test2CorrectIndex);
    }

    @Test
    public void n100_000Test3Solution2a() {
        int answer = oddOccurrencesInArray.solution2a(n100_001Test3);
        assertEquals(n100_001Test3CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n100_001Test3CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n100_001Test3CorrectIndex);
    }

    @Test
    public void n999_999Test1Solution2a() {
        int answer = oddOccurrencesInArray.solution2a(n999_999Test1);
        assertEquals(n999_999Test1CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n999_999Test1CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n999_999Test1CorrectIndex);
    }

    @Test
    public void n999_999Test2Solution2a() {
        int answer = oddOccurrencesInArray.solution2a(n999_999Test2);
        assertEquals(n999_999Test2CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n999_999Test2CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n999_999Test2CorrectIndex);
    }

    @Test
    public void n999_999Test3Solution2a() {
        int answer = oddOccurrencesInArray.solution2a(n999_999Test3);
        assertEquals(n999_999Test3CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n999_999Test3CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n999_999Test3CorrectIndex);
    }

    // solution3a
    @Test
    public void n100_000Test1Solution3a() {
        int answer = oddOccurrencesInArray.solution3a(n100_001Test1);
        assertEquals(n100_001Test1CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n100_001Test1CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n100_001Test1CorrectIndex);
    }

    @Test
    public void n100_000Test2Solution3a() {
        int answer = oddOccurrencesInArray.solution3a(n100_001Test2);
        assertEquals(n100_001Test2CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n100_001Test2CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n100_001Test2CorrectIndex);
    }

    @Test
    public void n100_000Test3Solution3a() {
        int answer = oddOccurrencesInArray.solution3a(n100_001Test3);
        assertEquals(n100_001Test3CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n100_001Test3CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n100_001Test3CorrectIndex);
    }

    @Test
    public void n999_999Test1Solution3a() {
        int answer = oddOccurrencesInArray.solution3a(n999_999Test1);
        assertEquals(n999_999Test1CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n999_999Test1CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n999_999Test1CorrectIndex);
    }

    @Test
    public void n999_999Test2Solution3a() {
        int answer = oddOccurrencesInArray.solution3a(n999_999Test2);
        assertEquals(n999_999Test2CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n999_999Test2CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n999_999Test2CorrectIndex);
    }

    @Test
    public void n999_999Test3Solution3a() {
        int answer = oddOccurrencesInArray.solution3a(n999_999Test3);
        assertEquals(n999_999Test3CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n999_999Test3CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n999_999Test3CorrectIndex);
    }

    // solution4a
    @Test
    public void n100_000Test1Solution4a() {
        int answer = oddOccurrencesInArray.solution4a(n100_001Test1);
        assertEquals(n100_001Test1CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n100_001Test1CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n100_001Test1CorrectIndex);
    }

    @Test
    public void n100_000Test2Solution4a() {
        int answer = oddOccurrencesInArray.solution4a(n100_001Test2);
        assertEquals(n100_001Test2CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n100_001Test2CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n100_001Test2CorrectIndex);
    }

    @Test
    public void n100_000Test3Solution4a() {
        int answer = oddOccurrencesInArray.solution4a(n100_001Test3);
        assertEquals(n100_001Test3CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n100_001Test3CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n100_001Test3CorrectIndex);
    }

    @Test
    public void n999_999Test1Solution4a() {
        int answer = oddOccurrencesInArray.solution4a(n999_999Test1);
        assertEquals(n999_999Test1CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n999_999Test1CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n999_999Test1CorrectIndex);
    }

    @Test
    public void n999_999Test2Solution4a() {
        int answer = oddOccurrencesInArray.solution4a(n999_999Test2);
        assertEquals(n999_999Test2CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n999_999Test2CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n999_999Test2CorrectIndex);
    }

    @Test
    public void n999_999Test3Solution4a() {
        int answer = oddOccurrencesInArray.solution4a(n999_999Test3);
        assertEquals(n999_999Test3CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n999_999Test3CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n999_999Test3CorrectIndex);
    }

    // solution4b
    @Test
    public void n100_000Test1Solution4b() {
        int answer = oddOccurrencesInArray.solution4b(n100_001Test1);
        assertEquals(n100_001Test1CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n100_001Test1CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n100_001Test1CorrectIndex);
    }

    @Test
    public void n100_000Test2Solution4b() {
        int answer = oddOccurrencesInArray.solution4b(n100_001Test2);
        assertEquals(n100_001Test2CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n100_001Test2CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n100_001Test2CorrectIndex);
    }

    @Test
    public void n100_000Test3Solution4b() {
        int answer = oddOccurrencesInArray.solution4b(n100_001Test3);
        assertEquals(n100_001Test3CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n100_001Test3CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n100_001Test3CorrectIndex);
    }

    @Test
    public void n999_999Test1Solution4b() {
        int answer = oddOccurrencesInArray.solution4b(n999_999Test1);
        assertEquals(n999_999Test1CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n999_999Test1CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n999_999Test1CorrectIndex);
    }

    @Test
    public void n999_999Test2Solution4b() {
        int answer = oddOccurrencesInArray.solution4b(n999_999Test2);
        assertEquals(n999_999Test2CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n999_999Test2CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n999_999Test2CorrectIndex);
    }

    @Test
    public void n999_999Test3Solution4b() {
        int answer = oddOccurrencesInArray.solution4b(n999_999Test3);
        assertEquals(n999_999Test3CorrectAnswer, answer);
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Expected: " + n999_999Test3CorrectAnswer + "\nGot: " + answer + "\nAt index: " + n999_999Test3CorrectIndex);
    }

    private static int[] createTestArray(int size){
        int[] testArray = new int[size];
        Random r = new Random();
        boolean[] isFilled = new boolean[size];
        for (int i = 0; i < (size - 1) / 2; i++)  {
            int index1;
            int index2;
            int value;
            do {
                index1 = r.nextInt(size);
            }
            while (isFilled[index1]);
            isFilled[index1] = true;
            do {
                index2 = r.nextInt(size);
            }
            while (isFilled[index2]);
            isFilled[index2] = true;
            value = r.nextInt(1000000000) + 1;
            testArray[index1] = value;
            testArray[index2] = value;
        }
        for (int i = 0; i < testArray.length; i++) {
            if (!isFilled[i]){
                tmpCorrectAnswer = r.nextInt(1000000000) + 1;
                testArray[i] = tmpCorrectAnswer;
                tmpCorrectIndex = i;
            }
        }
        return testArray;
    }

}