package denCars;

import java.util.HashSet;

public class DriverLicenceDb {
    ////            4. Створити клас який буде імітувати базу водійських прав використовуючи Set "Список водіїв" зі списком водіїв. Новий клас водія має зберігати усю інформацію з прав.
////            Має бути можливість додати водія, видалити водія, отримати інформацію про водія. Перевірка і видалення мають виконуватися за допомогою номера документа.

    private HashSet<Driver> drivers = new HashSet<>();

    public void addDriver(String name, String date, String licenceId) {

        Driver driver = new Driver(name, date, licenceId);
        drivers.add(driver);
    }

    public Driver getDriver(String licenceId) {
        for (Driver i : drivers) {
            if (i.licenceId == licenceId) {
                return i;
            }

        }
        return null;

    }

    public boolean removeDriver(String licenceId) {
        for (Driver i : drivers) {
            if (i.licenceId == licenceId) {
                drivers.remove(i);
                return true;
            }

        }
        return false;

    }

}



