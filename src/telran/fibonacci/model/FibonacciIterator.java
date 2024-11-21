package telran.fibonacci.model;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int i,size;
    private Integer prev,curr;

    public FibonacciIterator(int size) {
        this.size = size;
        this.i = 0;
    }

    @Override
    public boolean hasNext() {
        return i < size;
    }

    @Override
    public Integer next() {
        if (i < 2) {
            curr = prev = 1;
        } else {
            Integer tmp = curr;
            curr += prev;
            prev = tmp;
        }
        i++;
        return curr;
    }
}
