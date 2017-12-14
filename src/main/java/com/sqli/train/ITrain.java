package com.sqli.train;

/**
 * Train Component.
 *
 * @author Adami Hamza
 */
public interface ITrain {
    String print();
    void reAttach(ITrain part);
}
