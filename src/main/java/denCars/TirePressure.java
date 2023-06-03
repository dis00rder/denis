package denCars;

public class TirePressure {


    public static  void setTirePressure(float pressure, Car car) {

        for (int  i = 0; i < car.wheelPressure.length; i++) {

            car.wheelPressure[i] = pressure;
    }


}}
