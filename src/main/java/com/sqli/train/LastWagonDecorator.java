package com.sqli.train;

/**
 * Train concrete last wagon decorator (Teal).
 *
 * @author Adami Hamza
 */
public class LastWagonDecorator extends TrainDecorator{
    public LastWagonDecorator(ITrain train) {
        super(train);
    }

    @Override
    public String print() {
        return super.getTrain().print() + "HHHH>";
    }
}
