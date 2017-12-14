package com.sqli.train;

/**
 * Train abstract decorator.
 *
 * @author Adami Hamza
 */
public abstract class TrainDecorator implements ITrain {
    private ITrain train;

    public TrainDecorator(ITrain train) {
        this.train = train;
    }

    public void reAttach(ITrain to) {
        train = to;
    }

    public ITrain getTrain() {
        return train;
    }
}
