package telran.fibonacci;

import telran.fibonacci.model.Fibonacci;

import java.util.Iterator;

public class FibonacciAppl {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(8);
        Iterator<Integer> iterator = fibonacci.iterator();
        Integer sum = 0;
        while (iterator.hasNext()) {
            Integer curr = iterator.next();
            System.out.println(curr);
            sum += curr;
        }
        System.out.println("Sum = " + sum);
    }
}
