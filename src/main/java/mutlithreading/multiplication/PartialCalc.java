package mutlithreading.multiplication;

public class PartialCalc implements Runnable{
    private Reducer reducer;
    private Integer[] elements;
    private int lowerIndex;
    private int upperIndex;

    public PartialCalc(Reducer reducer, Integer[] elements, int lowerIndex, int upperIndex) {
        this.reducer = reducer;
        this.elements = elements;
        this.lowerIndex = lowerIndex;
        this.upperIndex = upperIndex;
    }

    @Override
    public void run() {
        for (int n = lowerIndex; n < upperIndex; n++) {
            elements[n] = reducer.multi(elements[n]);
        }
    }

}
