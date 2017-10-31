package com.java.patterns.behavioral.mediator.v2;

public class Thy1983 extends BaseSefer {

    public Thy1983(final Kule kule) {
        this.setKule(kule);
        kule.seferEkle(this);
    }

    @Override
    public String toString() {
        return "Thy 1983";
    }

    @Override
    public void inisIzniAl() {
        this.getKule().inisIzniVer(this);
    }

    @Override
    public void kalkisIzniAl() {
        this.getKule().kalkisIzniVer(this);
    }
}
