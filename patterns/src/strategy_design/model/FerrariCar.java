package strategy_design.model;

import strategy_design.strategy.impl.RoadDriveStrategy;

/**
 * Author: manojkumar.dev007
 * Created at: Jul 19, 2025
 */
public class FerrariCar extends Vehicle {

    public FerrariCar() {
        super("Ferrari Car", new RoadDriveStrategy());
    }
}
