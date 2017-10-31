package com.java.patterns.behavioral.mediator.v2;

public class Atlas99 extends BaseSefer {

    public Atlas99(final Kule kule) {
        this.setKule(kule);
        kule.seferEkle(this);
    }

    @Override
    public String toString() {
        return "Atlas 99";
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
