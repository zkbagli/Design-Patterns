package com.java.patterns.behavioral.mediator.v2;

import java.util.ArrayList;

public class IstanbulAtaturkHavalimaniKule implements Kule {

    private ArrayList<Sefer> seferList = new ArrayList<Sefer>();

    public ArrayList<Sefer> getSeferList() {
        return this.seferList;
    }

    public void setSefer(final ArrayList<Sefer> sefer) {
        this.seferList = sefer;
    }

    @Override
    public void seferEkle(final Sefer sefer) {
        if (!this.getSeferList().contains(sefer)) {
            this.getSeferList().add(sefer);
            System.out.println("Kule: " + sefer.toString() + " " + "- sefer listesine eklendi");
        }
    }

    public void seferSil(final Sefer sefer) {
        if (this.getSeferList().contains(sefer)) {
            this.getSeferList().remove(sefer);
            System.out.println("Kule: " + sefer.toString() + " " + "- sefer listesinen silindi");
        }
    }

    @Override
    public void inisIzniVer(final Sefer sefer) {
        boolean inisYapiliyor = false;
        Sefer inisYapanSefer = null;

        if (this.getSeferList().contains(sefer)) {
            for (int i = 0; i < this.getSeferList().size(); i++) {
                final Sefer tempSefer = this.getSeferList().get(i);

                if (tempSefer.isInisYapiyor()) {
                    inisYapiliyor = true;
                    inisYapanSefer = tempSefer;
                    break;
                }
            }

            if (!inisYapiliyor) {
                sefer.setInisYapiyor(true);
                System.out.println("Kule: " + sefer.toString() + "inis izni verildi.");
            } else {
                if (!sefer.equals(inisYapanSefer)) {
                    System.out.println("Kule: " + inisYapanSefer + " inis yapiyor. " + "Bu y�zden " + sefer + " seferine " + " inis izni verilemiyor!");
                }
            }
        } else {
            System.out.println(sefer.toString() + " sefer  listesinde yeralmiyor!");
        }

    }

    @Override
    public void kalkisIzniVer(final Sefer sefer) {
        boolean kalkisYapiliyor = false;
        Sefer kalkisYapanSefer = null;

        if (this.getSeferList().contains(sefer)) {
            for (int i = 0; i < this.getSeferList().size(); i++) {
                final Sefer tempSefer = this.getSeferList().get(i);
                if (tempSefer.isKalkisYapiyor()) {
                    kalkisYapiliyor = true;
                    kalkisYapanSefer = tempSefer;
                    break;
                }
            }

            if (!kalkisYapiliyor) {
                sefer.setKalkisYapiyor(true);
                System.out.println("Kule: " + sefer.toString() + "kalkis izni verildi.");
            } else {
                if (!sefer.equals(kalkisYapanSefer)) {
                    System.out.println("Kule: " + kalkisYapanSefer + " kalkis yapiyor. " + " Bu y�zden " + sefer + " " + "seferine kalkis izni verilemiyor!");
                }
            }
        } else {
            System.out.println(sefer.toString() + " sefer " + "listesinde yeralmiyor!");
        }
    }
}
