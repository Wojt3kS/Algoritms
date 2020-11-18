package test;

public class TestImp implements Test {
    int test = 3;

    @Override
    public int doAnotherTest() {
        return test;
    }

    public static void main(String[] args) {
        Test testImp = new TestImp();
        System.out.println(((TestImp)testImp).test);
        System.out.println(Test.test);
        System.out.println(testImp.doAnotherTest());
    }

    @Override
    public void soNothing() {

    }
}
