package com.java.patterns.behavioral.mediator.v2;

public class Test {
    public static void main(final String[] args) {
        final Kule kule = new IstanbulAtaturkHavalimaniKule();
        final Sefer thy1983 = new Thy1983(kule);
        final Sefer atlas99 = new Atlas99(kule);

        thy1983.inisIzniAl();
        atlas99.inisIzniAl();
        thy1983.setInisTamamlandi(true);
        atlas99.inisIzniAl();
        thy1983.inisIzniAl();
        atlas99.setInisTamamlandi(true);

        atlas99.kalkisIzniAl();
        thy1983.kalkisIzniAl();
        thy1983.kalkisIzniAl();
        atlas99.setKalkisTamamlandi(true);
        thy1983.kalkisIzniAl();
    }
}
