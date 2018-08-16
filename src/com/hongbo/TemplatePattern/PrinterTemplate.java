package com.hongbo.TemplatePattern;

public class PrinterTemplate {
    public void doPrint(Printer printer){
        printer.open();
        printer.print();
        printer.close();
    }
}
