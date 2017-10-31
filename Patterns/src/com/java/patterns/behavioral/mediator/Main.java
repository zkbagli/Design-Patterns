package com.java.patterns.behavioral.mediator;

public class Main {

    public static void main(final String[] args) {
        final ApplicationMediator mediator = new ApplicationMediator();
        final MobileColleague mobile = new MobileColleague(mediator);
        final DesktopColleague desktop = new DesktopColleague(mediator);
        mediator.addColleague(mobile);
        mediator.addColleague(desktop);
        mobile.send("Hello from mobile!");
        desktop.send("Hello from desktop!");
    }
}
