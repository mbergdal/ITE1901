package com.headcrest.generics;

import java.util.ArrayList;

/**
 * Created by mbe on 08/09/15.
 */
public class GenericClass {

    ArrayList things = new ArrayList();

    public GenericClass(){
        things.add("aString");
        things.add(new Integer(1));
        things.add(2);
    }


    public static <E> void print(E[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}
