package app.models;

import app.base.MyEquals;
import app.base.MyHashCode;

import java.util.Objects;

public class Car implements MyEquals, MyHashCode {

    public String name;
    public String color;
    public int quantity;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean myEquals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return quantity == car.quantity && Objects.equals(name, car.name) && Objects.equals(color, car.color);
    }

    @Override
    public int myHashCode() {
        int result = quantity;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
