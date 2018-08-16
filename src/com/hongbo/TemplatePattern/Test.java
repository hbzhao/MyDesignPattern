package com.hongbo.TemplatePattern;

public class Test {

    public static void main(String[] args) {
        PrinterTemplate printerTemplate = new PrinterTemplate();

//        通过匿名类的方式来实现不同的printer
//        可以通过匿名类来直接实现一个接口
//        模板模式还可以通过一个抽象类来实现
        printerTemplate.doPrint(new Printer() {
            @Override
            public void open() {
                System.out.println("this is name printer");
            }

            @Override
            public void print() {
                System.out.println("name");
            }

            @Override
            public void close() {
                System.out.println("close name printer");
            }
        });

        printerTemplate.doPrint(new Printer() {
            @Override
            public void open() {
                System.out.println("this is a server printer");
            }

            @Override
            public void print() {
                System.out.println("server");
            }

            @Override
            public void close() {
                System.out.println("close server printer");
            }
        });

    }
}
