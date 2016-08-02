package org.jkcsoft.spaces;

public abstract class Operation {

    private java.lang.reflect.Method jMethod;

    public String getName() {
        return jMethod.getName();
    }

    public abstract Object doOperation();

}
