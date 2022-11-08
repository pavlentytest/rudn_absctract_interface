public interface Calc {
    void action();
    void action2();
}
interface Switchable {
    void on();
    void off();
}

// интерфейс с 1 методом - функциональный
interface Calculable {
    int sum(int a, int b);
}

class CCC implements Calc, Switchable {
    @Override
    public void action() {

    }
    @Override
    public void action2() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }
}
