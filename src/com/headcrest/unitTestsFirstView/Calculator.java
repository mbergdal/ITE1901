package com.headcrest.unitTestsFirstView;

/**
 * Created by mbe on 24/08/15.
 */
public class Calculator {
    public int add(int first, int second) {
        if (first < 0 || second < 0){
            throw new ArithmeticException();
        }
        return first + second;
    }

    public int sub(int first, int second) {
        return first - second;
    }
}
