package by.electrinic;

public class GameBox extends Electroniq implements IElectroniq{
    private String name;
    private Double price;

    public GameBox(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    void setOn() {
        if(!super.isPower()){
           super.setPower(true);
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
    public Double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
