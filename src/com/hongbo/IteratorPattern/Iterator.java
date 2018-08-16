package com.hongbo.IteratorPattern;

public interface Iterator {
    void reset();
    boolean hasNext();
    public Object getNext();
}
