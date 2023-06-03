package denCars;

import java.security.SecureRandom;

public class Cars {
    static SecureRandom secureRandom = new SecureRandom();

    private Cars() {
    }

    public static Car getDummyCar() {
        Car car = new Car(secureRandom.nextInt(5) + 2010, 0, Color.WHITE, "");
        car.modelYear = car.carYear + secureRandom.nextInt(4);
        car.carMaker = switch (secureRandom.nextInt(3)) {
            case 0:
                yield "FORD";
            case 1:
                yield "VW";
            case 2:
                yield "OPEL";
            default:
                yield "TOYOTA";
        };
        return car;

    }

}
