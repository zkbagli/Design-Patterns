package com.java.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

interface AlarmListener {
    public void alarm();
}

class SensorSystem {
    private final List<AlarmListener> listeners = new ArrayList<AlarmListener>();

    public void register(final AlarmListener al) {
        this.listeners.add(al);
    }

    public void soundTheAlarm() {
        for (final AlarmListener alarmListener : this.listeners) {
            alarmListener.alarm();
        }
    }
}

class Lighting implements AlarmListener {
    @Override
    public void alarm() {
        System.out.println("lights up");
    }
}

class Gates implements AlarmListener {
    @Override
    public void alarm() {
        System.out.println("gates close");
    }
}

class CheckList {

    public void byTheNumbers() { // Template Method design pattern
        this.localize();
        this.isolate();
        this.identify();
    }

    protected void localize() {
        System.out.println("   establish a perimeter");
    }

    protected void isolate() {
        System.out.println("   isolate the grid");
    }

    protected void identify() {
        System.out.println("   identify the source");
    }
}

class Surveillance extends CheckList implements AlarmListener {
    @Override
    public void alarm() {
        System.out.println("Surveillance - by the numbers:");
        this.byTheNumbers();
    }

    @Override
    protected void isolate() {
        System.out.println("   train the cameras");
    }
}

public class Main {
    public static void main(final String[] args) {
        final SensorSystem ss = new SensorSystem();
        ss.register(new Gates());
        ss.register(new Lighting());
        ss.register(new Surveillance());
        ss.soundTheAlarm();
    }
}
