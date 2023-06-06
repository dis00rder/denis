package denCars;

import java.security.SecureRandom;
import java.util.Arrays;

public class Car extends Model {

    int carYear;
    Color carColor;
    String plateNum;
    final String VIN;

    SecureRandom secureRandom = new SecureRandom();

    final float[] wheelPressure = {2.5f, 2.5f, 2.2f, 2.2f};


    public Car(int carYear, int modelYear, Color carColor, String carMaker, String plateNum, String vin) {
        this.carYear = carYear;
        this.VIN = vin;
        this.plateNum=plateNum;
        this.modelYear = modelYear;
        this.carColor = carColor;
        this.carMaker = carMaker;

    }

    public boolean engineStart() {
        return secureRandom.nextInt(3) != 0;
    }

    public void checkTirePressure() throws Exception {

        float minPressure = 2;
        for (int i = 0; i < wheelPressure.length; i++) {
            if ( wheelPressure[i]< minPressure) {
                throw new LowTirePressureException();

            }
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "carYear=" + carYear +
                ", carColor=" + carColor +

                ", wheelPressure=" + Arrays.toString(wheelPressure) +
                ", modelYear=" + modelYear +
                ", carMaker='" + carMaker + '\'' +
                '}';
    }
}



