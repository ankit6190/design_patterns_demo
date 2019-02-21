package com.design.pattern.structural.adapter;


/*
* Accepting the CSVFormatter and converting them to text formatter
* */
public class CSVAdapterImpl implements TextFormattable {

    private CSVFormattable csvFormattable;

    public CSVAdapterImpl(CSVFormattable csvFormattable){
        this.csvFormattable=csvFormattable;
    }

    /*
    * Making CSVFormattable compatible with  TextFormattable
    *
    * */
    @Override
    public String formatText(String text) {
        return csvFormattable.formatCsvText(text);
    }
}
