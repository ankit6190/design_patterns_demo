package com.design.pattern.structural.adapter;


/*
 * Consider this file is in third Party Library
 * */
public class CSVFormatter implements CSVFormattable {
    @Override
    public String formatCsvText(String text) {
        return text.replace(".",",");
    }
}
