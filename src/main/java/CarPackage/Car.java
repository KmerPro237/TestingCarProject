package CarPackage;

import javax.persistence.*;

@Entity
public class Car {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CarID")
    private int carId;
    @Basic
    @Column(name = "CarType")
    private String carType;
    @Basic
    @Column(name = "CarBrand")
    private String carBrand;
    @Basic
    @Column(name = "ManufacturingYear")
    private int manufacturingYear;
    @Basic
    @Column(name = "NumberOfSeats")
    private int numberOfSeats;
    @Basic
    @Column(name = "BasicPrice")
    private double basicPrice;
    @Basic
    @Column(name = "DailyPrice")
    private double dailyPrice;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (carId != car.carId) return false;
        if (manufacturingYear != car.manufacturingYear) return false;
        if (numberOfSeats != car.numberOfSeats) return false;
        if (Double.compare(car.basicPrice, basicPrice) != 0) return false;
        if (Double.compare(car.dailyPrice, dailyPrice) != 0) return false;
        if (carType != null ? !carType.equals(car.carType) : car.carType != null) return false;
        if (carBrand != null ? !carBrand.equals(car.carBrand) : car.carBrand != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = carId;
        result = 31 * result + (carType != null ? carType.hashCode() : 0);
        result = 31 * result + (carBrand != null ? carBrand.hashCode() : 0);
        result = 31 * result + manufacturingYear;
        result = 31 * result + numberOfSeats;
        temp = Double.doubleToLongBits(basicPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(dailyPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
