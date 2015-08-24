package com.headcrest;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @After
    public void after(){
        System.out.println("after test");
    }

    @Test
    public void add_onePlusOne_EqualsTwo(){
        int result = calc.add(1,1);
        assertEquals(2, result);
    }

    @Test
    public void add_TwoPlusTwo_EqualsFour(){
        int result = calc.add(2,2);
        assertEquals(4, result);
    }

    @Test(expected = ArithmeticException.class)
    public void add_negativeNumbers_throwsException(){
        calc.add(-1,-1);
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("after class");
    }
}