package mycare;

import com.vehicle.Toyota;

public class DriveToyota {

    public static void main(String[] args) {
       Toyota myToyota = new Toyota();
        myToyota.turnON_OF();
        myToyota.setHand_brake(false);
        myToyota.setTransmission((short) 1);

        //myToyota.setHand_brake(false);
        myToyota.setTransmission((short) 2);
        myToyota.setPedalStop(true);
        myToyota.setHand_brake(true);
        myToyota.turnON_OF();
      //  myToyota.setHand_brake(true);*/

    }
}
