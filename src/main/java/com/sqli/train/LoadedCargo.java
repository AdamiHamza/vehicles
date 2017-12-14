package com.sqli.train;

/**
 * Cargo concrete Loaded State.
 *
 * @author Adami Hamza
 */
public class LoadedCargo implements CargoState {

    @Override
    public void fill(CargoDecorator cargoDecorator) {
        System.out.println("AllReady Full");
    }

    @Override
    public void clear(CargoDecorator cargoDecorator) {
        cargoDecorator.setCargoState(new EmptyCargo());
    }
}
