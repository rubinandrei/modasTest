package by.collection;


import by.electrinic.GameBox;
import by.electrinic.IElectroniq;
import by.electrinic.Тelevision;

import java.util.*;

public class DataCollection {
    private static List<IElectroniq> listString;


    static {

        listString = new ArrayList();

        Тelevision television = new Тelevision("Toshiba",1000.89,44);
        GameBox gamebox = new GameBox("PlayStation" , 400.95);
        listString.add(television);
        listString.add(gamebox);


        //listString.remove("Done");
        System.out.println(listString.contains("Done"));
        System.out.println(listString.get(1));




    }
   /* public void col(List<IElectroniq> list){
        for(IElectroniq obj: list)
            System.out.println("---" + obj.getName());
    }*/

    /*public IElectroniq getColl(List<IElectroniq> list, String type){
        for(IElectroniq obj: list) {
            System.out.println("---" + obj.getName());
            if(obj.getName().equalsIgnoreCase(type)){
                return obj;
            }
        }
        return null;
    }*/
/*
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Godel", "Rubin");

        for(String per: map.keySet()){
            map.get(per);

        }

        DataCollection coll = new DataCollection();
        coll.col(listString);
        IElectroniq test = coll.getColl(listString,"PlayStation");
        System.out.println(test.getName() + " " + test.getPrice());
    }*/

}
