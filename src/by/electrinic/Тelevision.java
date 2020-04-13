package by.electrinic;

public class Тelevision extends Elctronic implements IElectroniq{


    private String name;
    private Double price;
    private int diagonal;

    public Тelevision(String name, Double price, int diagonal) {
        this.name = name;
        this.price = price;
        this.diagonal = diagonal;
    }

    @Override
    void setOn() {
       setPower(true);
    }

    @Override
    void senOff() {
        setPower(false);
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Тelevision{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", diagonal=" + diagonal +
                ", power=" + super.isPower() +
                '}';
    }
}
