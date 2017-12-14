package com.sqli.train;

/**
 * Train concrete cargo decorator (Empty/Loaded Cargo) / State Context.
 *
 * @author Adami Hamza
 */
public class CargoDecorator extends TrainDecorator {
    /**
     * The state of the cargo loaded/empty.
     */
    private CargoState cargoState;

    public CargoDecorator(ITrain train, CargoState cargoState) {
        super(train);
        this.cargoState = cargoState;
    }

    @Override
    public String print() {
        if(cargoState instanceof EmptyCargo)
            return super.getTrain().print() + "|____|";
        else
            return super.getTrain().print() + "|^^^^|";
    }

    public void fill (){
        this.cargoState.fill(this);
    }


    public void clear (){
       this.cargoState.clear(this);
    }


    public void setCargoState(final CargoState cargoState) {
        this.cargoState = cargoState;
    }

    public CargoState getCargoState() {
        return cargoState;
    }
}
