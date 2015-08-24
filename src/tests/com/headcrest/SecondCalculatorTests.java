package com.headcrest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mbe on 24/08/15.
 */
public class SecondCalculatorTests {

    @Test
    public void myOtherTest(){
        Calculator calc = new Calculator();
        int result = calc.sub(3,1);
        assertEquals(result, 2);
    }
}
