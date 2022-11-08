public class Main {
    public static void main(String[] args) {
        Test test1 = new Test();

        Test test2 = new Test() {
            @Override
            public void toDo() {

            }
            @Override
            public void test1() {

            }
            @Override
            public void test2() {

            }
        };
        test2.toDo();
        test2.test1();

        Base base = new Base();

        BBB b22 = new BBB() {
            @Override
            public void doBBB() {

            }
        };
        b22.doBBB();


        Calc calc = new Calc() {
            @Override
            public void action() {

            }
            @Override
            public void action2() {

            }
        };
        calc.action();
        calc.action2();

        CCC ccc = new CCC();
        ccc.action();
        ccc.action2();


        // реализация интерфейса через анонимный класс

        Calculable calc2 = new Calculable() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        Calculable calc3 = (a, b) -> {
            a = a + 100;
            b *= 2;
            return a+b;
        };
        System.out.println(calc2.sum(4,5));






    }
}