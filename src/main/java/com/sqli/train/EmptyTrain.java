package com.sqli.train;

/**
 *
 * @author Adami Hamza
 */
public class EmptyTrain implements  ITrain {
    private final String representation = "";
    @Override
    public String print() {
        return representation;
    }

    @Override
    public void reAttach(ITrain to) {

    }
}