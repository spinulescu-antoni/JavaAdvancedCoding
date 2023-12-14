package claseanonime;

import java.util.StringJoiner;

public class Car {
    private double price;
    private CarType type;
    private int year;

    public Car(int price, CarType type, int year) {
        this.price = price;
        this.type = type;
        this.year = year;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("price=").append(price);
        sb.append(", type=").append(type);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }


    public CarType getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
