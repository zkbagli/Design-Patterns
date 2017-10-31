package com.java.patterns.creational.abstractfactory;

public class AbstractFactory {

    private AbstractFactory() {
    }

    private static AbstractFactory instance = new AbstractFactory();

    public static AbstractFactory getInstance() {
        return AbstractFactory.instance;
    }

    public IArchitectureToolkit createToolkit(final ArchitectureType architecture) {
        if (ArchitectureType.x64.equals(architecture)) {
            return new ArchitectureToolkit_x64();
        } else if (ArchitectureType.x86.equals(architecture)) {
            return new ArchitectureToolkit_x86();
        } else {
            throw new IllegalArgumentException("Not supported architecture " + architecture);
        }
    }
}
