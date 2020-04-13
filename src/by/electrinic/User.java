package by.electrinic;

public class User {

    public static void printPrice(IElectroniq electroniq){
        System.out.println("Price for " + electroniq.getName() + " is: " + electroniq.getPrice() );
        System.out.println(electroniq.toString());
    }

    public static void printPrice(boolean toStr, Elctronic electroniq){
        if(toStr)
            System.out.println(electroniq.toString());
        else{
            System.out.println("Иди нафиг");
        }
    }

    public static void main(String[] args) {
        GameBox gamebox = new GameBox("PlayStation" , 400.95);
        Тelevision television = new Тelevision("Toshiba",1000.89,44);
        System.out.println("--------------------------------1------------------------------------ \n");
        printPrice(gamebox);
        System.out.println("--------------------------------2------------------------------------\n");
        printPrice(television);
        System.out.println("--------------------------------3------------------------------------\n");
        printPrice(true,gamebox);
        System.out.println("--------------------------------4------------------------------------\n");
        printPrice(false, television);
    }
}
