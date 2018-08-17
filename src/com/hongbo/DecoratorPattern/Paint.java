package com.hongbo.DecoratorPattern;

public class Paint extends Display {
    public final String content="this is a paint";
    @Override
    public int getColumnCount() {
        return content.length();
    }

    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public String getRowContent(int index) {
        return content;
    }
}
