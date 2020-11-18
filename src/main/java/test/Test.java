package test;

public interface Test extends Test2 {
    int test = 0;

    default int doTest(){
        return test;
    }

    default int doAnotherTest(){
        return test + 1;
    }
}
