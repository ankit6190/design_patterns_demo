package com.design.pattern.structural.adapter;

public class AdapterPatternTest {

    public static void main(String s[]){
        System.out.println("====== New Line Formatter start");
        TextFormattable textFormattable= new NewLineFormatter();
        System.out.println(textFormattable.formatText("asdasd.asdasdas.qweqwe"));

        System.out.println("========== New Line Formatter end");

        System.out.println("========== New Line Formatter start");
        // Third Party Library class
        CSVFormatter csvFormatter = new CSVFormatter();
        TextFormattable csvFormattable = new CSVAdapterImpl(csvFormatter);
        System.out.println(csvFormattable.formatText("asdasd.asdasdas.qweqwe"));

        System.out.println("========== New Line Formatter end");
    }
}
