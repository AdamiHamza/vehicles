package com.sqli.train;

/**
 * Cargo concrete Empty State.
 *
 * @author Adami Hamza
 */
public class EmptyCargo implements CargoState {
    @Override
    public void fill(CargoDecorator cargoDecorator) {
        cargoDecorator.setCargoState(new LoadedCargo());
    }

    @Override
    public void clear(CargoDecorator cargoDecorator) {
        System.out.println("AllReady Clear");
    }
}
