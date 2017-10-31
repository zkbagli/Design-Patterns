package com.java.patterns.behavioral.mediator.v2;

public abstract class BaseSefer implements Sefer {

    private boolean inisTamamlandi;
    private boolean kalkisTamamlandi;
    private boolean inisYapiyor;
    private boolean kalkisYapiyor;

    private Kule kule;

    public Kule getKule() {
        return this.kule;
    }

    public void setKule(final Kule kule) {
        this.kule = kule;
    }

    public boolean isInisTamamlandi() {
        return this.inisTamamlandi;
    }

    @Override
    public void setInisTamamlandi(final boolean inisTamamlandi) {
        this.inisTamamlandi = inisTamamlandi;
        this.inisYapiyor = false;
        System.out.println(this.toString() + " inisi tamamladi.");
    }

    public boolean isKalkisTamamlandi() {
        return this.kalkisTamamlandi;
    }

    @Override
    public void setKalkisTamamlandi(final boolean kalkisTamamlandi) {
        this.kalkisTamamlandi = kalkisTamamlandi;
        this.kalkisYapiyor = false;
        System.out.println(this.toString() + " kalkisi tamamladi.");
    }

    @Override
    public boolean isInisYapiyor() {
        return this.inisYapiyor;
    }

    @Override
    public void setInisYapiyor(final boolean inisYapiyor) {
        this.inisYapiyor = inisYapiyor;
    }

    @Override
    public boolean isKalkisYapiyor() {
        return this.kalkisYapiyor;
    }

    @Override
    public void setKalkisYapiyor(final boolean kalkisYapiyor) {
        this.kalkisYapiyor = kalkisYapiyor;
    }
}
