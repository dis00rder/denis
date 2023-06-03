package denCars;

public class Driver {

    public String name;
    public String date;
    public String licenceId;

    public Driver(String name, String date, String licenceId) {
        this.name = name;
        this.date = date;
        this.licenceId = licenceId;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", licenceId='" + licenceId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        return licenceId.equals(driver.licenceId);
    }

    @Override
    public int hashCode() {
        return licenceId.hashCode();
    }
}
