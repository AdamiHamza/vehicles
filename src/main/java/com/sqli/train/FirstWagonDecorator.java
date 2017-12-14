package com.sqli.train;

/**
 * Train concrete last wagon decorator (Head).
 */
public class FirstWagonDecorator extends TrainDecorator{
    public FirstWagonDecorator(ITrain train) {
        super(train);
    }

    @Override
    public String print() {
        return super.getTrain().print() + "<HHHH";
    }
}
