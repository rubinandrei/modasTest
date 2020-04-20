package by.electrinic;

import by.TestException;
import by.ExeptionFields;

public class GameBox extends Electroniq implements IElectroniq{
    private String name;
    private Double price;

    public GameBox(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    void setOn() {
        if (!super.isPower()) {
            throw new TestException("Уже включен");
        }
    }

    @Override
    void senOff() {
        if(super.isPower()){
            super.setPower(false);
        }
    }

    @Override
    public String toString() {
        return "GameBox{" +
                "name='" + name + '\'' +
                ", price=" + price  +
                ", power=" + super.isPower() +
                '}';
    }

    @Override
    public Double getPrice() throws TestException {
        if(this.price == 0 )
            throw new TestException("Цена не должна быть равна " + this.price);

        return price;
    }

    @Override
    public String getName() throws RuntimeException {
        if(name.equalsIgnoreCase("Radio"))
            throw new TestException( "только не радио");

        return name;
    }
}
