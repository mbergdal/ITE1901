package com.headcrest.generics;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mbe on 08/09/15.
 */
public class GenericClassTest {
    GenericClass theClass = new GenericClass();

    @Test
    public void test1(){
        String string = (String)theClass.things.get(0);
        Integer integer = (Integer)theClass.things.get(1);
    }

    @Test
    public void printIntegers(){
        Integer[] integers = {1, 2, 3, 4, 5};
        GenericClass.print(integers);
    }

    @Test
    public void printStrings(){
        String[] strings = {"London", "Paris", "New York", "Austin"};
        GenericClass.print(strings);
    }


}