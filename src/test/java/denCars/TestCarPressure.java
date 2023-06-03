package denCars;

import org.testng.annotations.Test;

import java.util.Arrays;

import static denCars.Cars.getDummyCar;

public class TestCarPressure {

    @Test
    public void testPressure() {
        //Car opel = new Car(2021, 2020, Color.WHITE, "OPEL");
        Car car = getDummyCar();

        System.out.println(Arrays.toString(car.wheelPressure));
        TirePressure.setTirePressure(3, car);
        System.out.println(Arrays.toString(car.wheelPressure));
    }

    @Test
    public void testLowPressurePositive() throws Exception {
        Car car = getDummyCar();
        TirePressure.setTirePressure(3, car);
        car.checkTirePressure();
    }

    @Test
    public void testLowPressureNegative() throws Exception {
        Car car = getDummyCar();
        TirePressure.setTirePressure(1, car);

        try {
            car.checkTirePressure();
        } catch (LowTirePressureException e) {
            //do nothing
        }

    }
}
