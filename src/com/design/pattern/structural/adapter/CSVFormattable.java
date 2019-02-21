package com.design.pattern.structural.adapter;


/*
* Consider CSV formatter is in third Party Library
* */
public interface CSVFormattable {
    String formatCsvText(String text);
}
