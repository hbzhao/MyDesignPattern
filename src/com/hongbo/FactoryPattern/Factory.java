package com.hongbo.FactoryPattern;

import java.util.UUID;

public abstract class Factory {

    public final IProduct createProduct(){
        String serialNumber=UUID.randomUUID().toString();
        IProduct p=create(serialNumber);
        inspect(p);
        return p;
    }

    protected abstract void inspect(IProduct product);

    protected abstract IProduct create(String serialNumber);

}
