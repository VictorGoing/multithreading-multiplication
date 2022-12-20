package mutlithreading.multiplication;

public class Reducer {
    private int counter = 2;

    public synchronized int multi(int value) {
        return  counter * value;
    }

}
