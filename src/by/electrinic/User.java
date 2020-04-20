package by.electrinic;

import by.ExeptionFields;
import by.TestException;

public class User {

    public static void printPrice(IElectroniq electroniq) throws ExeptionFields {
        //System.out.println("Price for " + electroniq.getName() + " is: " + electroniq.getPrice() );
        System.out.println(electroniq.toString());
    }

    public static void printPrice(boolean toStr, Electroniq electroniq){
        if(toStr)
            System.out.println(electroniq.toString());
        else{
            System.out.println("Иди нафиг");
        }
    }

    public static void main(String[] args) {
        Тelevision tele = new Тelevision("Грюндик",0.05,2);
        try{
            tele.getPrice();
        }catch (RuntimeException ex){
            if(ex.getMessage().equals("Для нищебродов"))
                tele.setPrice(30.50);

        }finally {
            System.out.println(tele.getPrice());
        }

    }
}
