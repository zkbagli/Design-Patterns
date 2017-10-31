package com.java.patterns.behavioral.mediator.v2;

public interface Sefer {

    void inisIzniAl();

    void kalkisIzniAl();

    boolean isKalkisYapiyor();

    boolean isInisYapiyor();

    void setInisYapiyor(boolean value);

    void setKalkisYapiyor(boolean value);

    void setKalkisTamamlandi(boolean value);

    void setInisTamamlandi(boolean value);

}
