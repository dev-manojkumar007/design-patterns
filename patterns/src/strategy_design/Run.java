package strategy_design;

import strategy_design.model.FerrariCar;
import strategy_design.model.HondaCar;
import strategy_design.model.MountainTruck;

/**
 * Author: manojkumar.dev007
 * Created at: Jul 19, 2025
 */
public class Run {

    public static void runStrategyDesignImplementation() {
        HondaCar hondaCar = new HondaCar();
        FerrariCar ferrariCar = new FerrariCar();
        MountainTruck mountainTruck = new MountainTruck();

        hondaCar.drive();
        ferrariCar.drive();
        mountainTruck.drive();
    }
}
