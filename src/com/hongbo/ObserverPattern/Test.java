package com.hongbo.ObserverPattern;

public class Test {
    public static void main(String[] args){
        CodeFile codeFile=new CodeFile();

        codeFile.addObverver(new EditView());
        codeFile.addObverver(new OutlineView());
        codeFile.load("try");
    }
}
