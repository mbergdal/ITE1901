package com.headcrest.unitTestsFirstView;

import com.headcrest.unitTestsFirstView.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedTests {

    private int first;
    private int second;
    private int result;

    @Parameterized.Parameters
    public static List<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1,1,2},
                {2,2,4},
                {9,11,20}
        });
    }

    public ParameterizedTests(int first, int second, int result){

        this.first = first;
        this.second = second;
        this.result = result;
    }

    @Test
    public void add(){
        Calculator calc = new Calculator();
        int result = calc.add(first, second);
        assertEquals(this.result, result);
    }
}
