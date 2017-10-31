package com.java.patterns.behavioral.mediator;

import java.util.ArrayList;

public class ApplicationMediator implements IMediator {

    private final ArrayList<Colleague> colleagues;

    public ApplicationMediator() {
        this.colleagues = new ArrayList<Colleague>();
    }

    public void addColleague(final Colleague colleague) {
        this.colleagues.add(colleague);
    }

    @Override
    public void send(final String message,
                     final Colleague originator) {
        for (final Colleague col : this.colleagues) {
            if (col != originator) {
                col.receive(message);
            }
        }
    }

}
