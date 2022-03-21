package com.bridgelabz.generic;

public class Generic <T> {
    T object;

    public Generic(T object) {
        this.object = object;
    }

    public void show()
    {
        System.out.println("the type of ob is" + object.getClass().getName());
    }
    public T getObject()
    {
        return object;
    }
}