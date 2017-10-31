package com.java.patterns.creational.abstractfactory;

public class ArchitectureToolkit_x64 implements IArchitectureToolkit {

    @Override
    public CPU createCpu() {
        return new CPU_x64();
    }

    @Override
    public MMU createMmu() {
        return new MMU_x64();
    }

}
