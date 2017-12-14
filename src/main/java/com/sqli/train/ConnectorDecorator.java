package com.sqli.train;

/**
 * Train concrete connector decorator (Teal).
 *
 * @author Adami Hamza
 */
public class ConnectorDecorator extends TrainDecorator{
    public ConnectorDecorator(ITrain train) {
        super(train);
    }

    @Override
    public String print() {
        return super.getTrain().print() + "::";
    }
}
