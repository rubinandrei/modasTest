package by.electrinic;

public abstract class Electroniq {
    private boolean power;
    abstract void setOn();
    abstract void senOff();

    protected boolean isPower() {
        return power;
    }

    protected void setPower(boolean value) {
        power = true;
    }


    @Override
    public String toString() {
        return "Elctronic{" +
                "power=" + power +
                '}';
    }
}
