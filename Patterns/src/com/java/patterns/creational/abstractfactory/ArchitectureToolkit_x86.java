package com.java.patterns.creational.abstractfactory;

public class ArchitectureToolkit_x86 implements IArchitectureToolkit {

    @Override
    public CPU createCpu() {
        return new CPU_x86();
    }

    @Override
    public MMU createMmu() {
        return new MMU_x86();
    }

}
