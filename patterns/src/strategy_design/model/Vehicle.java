package strategy_design.model;

import strategy_design.strategy.DriveStrategy;

/**
 * Author: manojkumar.dev007
 * Created at: Jul 19, 2025
 */
public class Vehicle {

    private String name;
    private DriveStrategy driveStrategy;

    public Vehicle(String name, DriveStrategy driveStrategy) {
        this.name = name;
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive(name);
    }
}
