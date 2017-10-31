package com.java.patterns.creational.abstractfactory;

public class Main {

    public static void main(final String[] args) {
        final AbstractFactory af = AbstractFactory.getInstance();
        final IArchitectureToolkit toolkit_x64 = af.createToolkit(ArchitectureType.x64);
        System.out.println(toolkit_x64.createCpu().getClass());
        System.out.println(toolkit_x64.createMmu().getClass());
        final IArchitectureToolkit toolkit_x86 = af.createToolkit(ArchitectureType.x86);
        System.out.println(toolkit_x86.createCpu().getClass());
        System.out.println(toolkit_x86.createMmu().getClass());
    }

}
