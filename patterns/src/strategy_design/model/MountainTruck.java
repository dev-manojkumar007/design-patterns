package strategy_design.model;

import strategy_design.strategy.impl.OffRoadDriveStrategy;

/**
 * Author: manojkumar.dev007
 * Created at: Jul 19, 2025
 */
public class MountainTruck extends Vehicle {

    public MountainTruck() {
        super("Mountain Truck", new OffRoadDriveStrategy());
    }
}
