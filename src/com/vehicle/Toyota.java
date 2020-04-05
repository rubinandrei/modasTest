package com.vehicle;

public class Toyota {

    private final String TYPE = "Rav4";
    private final String CAR_BODY = "Crossover";
    private final String TRANSMISSION_TYPE = "manual";
    private short transmission;
    private boolean pedalStop;
    private boolean hand_brake = true;
    private boolean motor = false;
    private int speed;
    private boolean dippedBeam;  //ближний свет
    private boolean highBeam; // Дальний свет


    private String getTYPE() {
        return TYPE;
    }

    private String getCAR_BODY() {
        return CAR_BODY;
    }

    private String getTRANSMISSION_TYPE() {
        return TRANSMISSION_TYPE;
    }


    public void turnON_OF(){
        if(motor) {
            motor = false;
            setDippedBeam(false);
            getInfoFromDashboard ("Мотор выключен");
            getInfoFromDashboard ("Скорость :" + speed);
            getInfoFromDashboard("Ручной тормоз:" + hand_brake);
        }
        else {
            motor = true;
            getInfoFromDashboard(TYPE + "  " + CAR_BODY + "  " + TRANSMISSION_TYPE);
            setDippedBeam(true);
            getInfoFromDashboard ("Мотор включен");
            getInfoFromDashboard ("Скорость :" + speed);
            getInfoFromDashboard("Ручной тормоз:" + hand_brake);
        }
    }

    private short getTransmission() {
        return transmission;
    }


    public void setTransmission(short transmission) {
        if(motor && !isHand_brake()) {
            this.transmission = transmission;
            if (this.transmission == 1) {
                setSpeed(10);

            }
            if (this.transmission == 2) {
                if(getPedalStop())
                    setPedalStop(false);
                    setSpeed(30);

            }
            if (this.transmission == 3) {
                setSpeed(40);
                setPedalStop(false);
            }
            if (this.transmission == 4) {
                setSpeed(50);
                setPedalStop(false);
            }
            if (this.transmission == 5) {
                setSpeed(60);
                setPedalStop(false);
            }
            if (this.transmission == 6) {
                setSpeed(-10);
                setPedalStop(false);
            }
        }else{
            setSpeed(0);
        }


    }

    private boolean getPedalStop() {
        return pedalStop;
    }

    public void setPedalStop(boolean pedalStop) {
        setSpeed(0);
        this.pedalStop = pedalStop;
    }

    public boolean isHand_brake() {
        return hand_brake;
    }

    public void setHand_brake(boolean hand_brake) {
        this.hand_brake = hand_brake;
    }

    private void getInfoFromDashboard(String info ){

        System.out.printf("Auto : is %s  \n",info);

    }

    private void getInfoBeam(String info, boolean beamType){
        getInfoFromDashboard(info + (beamType?" Включен ":"Выключен"));
    }


    private void setSpeed(int speed) {
        this.speed = speed;
        getInfoFromDashboard("Скорость : " + speed + "  передача " + getTransmission());
    }

    public void isDippedBeam() {
        getInfoBeam("Ближний свет " ,dippedBeam);
    }

    public void isHighBeam() {
        getInfoBeam("Дальний свет " , highBeam);
    }


    public void setDippedBeam(boolean setBeam) {
        this.dippedBeam = setBeam;
        getInfoBeam("Ближний свет " ,dippedBeam);
    }

    public void setHighBeam(boolean setBeam) {
        this.highBeam = setBeam;
        getInfoBeam("Дальний свет " , highBeam);
    }


}
