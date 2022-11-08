public abstract class Test {
    public abstract void toDo();
    public abstract void test1();
    public abstract void test2();
    public void doPrint() {
        System.out.println("Print!");
    }

}

abstract class BBB {
    public abstract void doBBB();
}

// Alt-Enter
class Base extends Test {

    @Override
    public void toDo() {

    }

    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }
}


