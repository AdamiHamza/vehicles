package com.sqli.train;

/**
 * Train concrete passenger decorator.
 *
 * @author Adami Hamza
 */
public class PassengerDecorator extends TrainDecorator {
    public PassengerDecorator(ITrain train) {
        super(train);
    }

    @Override
    public String print() {
        return super.getTrain().print() + "|OOOO|";
    }
}
