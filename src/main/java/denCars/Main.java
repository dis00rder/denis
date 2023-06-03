package denCars;

public class Main {
    public static void main(String[] args) {

        DriverLicenceDb db = new DriverLicenceDb();

        db.addDriver("Ivan","11.09.2023", "ET5678");
        db.addDriver("Petro","11.04.2023", "ER2278");
        db.addDriver("Pedro","11.04.2023", "ER2278");
        db.addDriver("Denis","12.09.2023", "EF1178");

        System.out.println(db.getDriver("EF1178"));
        db.removeDriver("ER2278");
        System.out.println(db.getDriver("ER2278"));

        }
    }

