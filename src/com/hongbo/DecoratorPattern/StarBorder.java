package com.hongbo.DecoratorPattern;

public class StarBorder extends Border {


    public StarBorder(Display display){
        super(display);
    }

    @Override
    public int getColumnCount() {
        return display.getColumnCount()+2;
    }

    @Override
    public int getRowCount() {
        return display.getRowCount()+2;
    }

    @Override
    public String getRowContent(int index) {
        if(index==0||index==getRowCount()-1){
            return "///////////////////";
        }else {
            return display.getRowContent(index-1);
        }
    }
}
