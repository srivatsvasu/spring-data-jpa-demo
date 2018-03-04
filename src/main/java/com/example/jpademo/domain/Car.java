package com.example.jpademo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "TCAR")
public class Car {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String model;

    private int version;

    private String color;


    public Car() {

    }

    public Car(String name, String model, int version, String color) {
        this.name = name;
        this.model = model;
        this.version = version;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getVersion() == car.getVersion() &&
                Objects.equals(getId(), car.getId()) &&
                Objects.equals(getName(), car.getName()) &&
                Objects.equals(getModel(), car.getModel()) &&
                Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getName(), getModel(), getVersion(), getColor());
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", version=" + version +
                ", color='" + color + '\'' +
                '}';
    }
}
