package strategy_design.strategy.impl;

import strategy_design.strategy.DriveStrategy;

/**
 * Author: manojkumar.dev007
 * Created at: Jul 19, 2025
 */
public class OffRoadDriveStrategy implements DriveStrategy {

    @Override
    public void drive(String name) {
        System.out.println(name + " drives on mountains");
    }
}
