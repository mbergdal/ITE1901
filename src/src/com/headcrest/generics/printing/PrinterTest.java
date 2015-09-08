package com.headcrest.generics.printing;

import java.awt.*;

public class PrinterTest {

    public static void main(String[] args){
        Printer printer = new Printer();
        printer.print(1);

//        Printer<ColorCartridge> printer = new Printer(new ColorCartridge());
//        printer.print(2);
//        printer.printUsingCartridge(new BWCartridge(), "Hi!");

        //printWithPrinter(printer);
    }

    //Wildcards
//    private static void printUsingPrinter(Printer printer){
//        String fillPercentage = printer.getCartridge().getFillPercentage();
//        System.out.println(fillPercentage);
//    }
}
