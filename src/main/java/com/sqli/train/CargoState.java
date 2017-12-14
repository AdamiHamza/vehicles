package com.sqli.train;

/**
 * Cargo state.
 *
 * @author Adami Hamza
 */
public interface CargoState {
    void fill(CargoDecorator cargoDecorator);
    void clear(CargoDecorator cargoDecorator);
}
