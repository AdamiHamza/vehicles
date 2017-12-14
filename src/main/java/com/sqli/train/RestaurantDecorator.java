package com.sqli.train;

/**
 * Train concrete restaurant decorator.
 *
 * @author Adami Hamza
 */
public class RestaurantDecorator extends TrainDecorator{
    public RestaurantDecorator(ITrain train) {
        super(train);
    }

    @Override
    public String print() {
        return super.getTrain().print() + "|hThT|";
    }
}
