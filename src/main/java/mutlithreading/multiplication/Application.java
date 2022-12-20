package mutlithreading.multiplication;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Application {
    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        Integer[] array = new Integer[10];
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }

        Reducer reducer = new Reducer();

        PartialCalc p1 = new PartialCalc(reducer, array, 0, 5);
        PartialCalc p2 = new PartialCalc(reducer, array, 5, array.length);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(Arrays.deepToString(array));
    }
}
