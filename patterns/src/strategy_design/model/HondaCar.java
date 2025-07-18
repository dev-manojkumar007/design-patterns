package strategy_design.model;

import strategy_design.strategy.impl.RoadDriveStrategy;

/**
 * Author: manojkumar.dev007
 * Created at: Jul 19, 2025
 */
public class HondaCar extends Vehicle {

    public HondaCar() {
        super("Honda Car", new RoadDriveStrategy());
    }
}
