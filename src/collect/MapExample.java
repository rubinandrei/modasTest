package collect;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {
	public void hashMapExample() {
		
		HashMap<String, String> myHashMap = new HashMap<String, String>();

		
        myHashMap.put("Basil", "07.12.1987");
        myHashMap.put("Kate", "12.10.1971");
        myHashMap.put("Lena", "11.01.1991");
        myHashMap.put("", "11.01.1991");
        
        for(Entry<String, String> entry: myHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
        
        System.out.println("The value for 'Basil' is " + myHashMap.get("Basil"));
        
        System.out.println("Before removing a key:");
        for(Entry<String, String> entry: myHashMap.entrySet())
        	if(entry.getValue().equals("11.01.1991"))
        		System.out.println("-----" + entry.getKey() + " - " + entry.getValue());
 
        myHashMap.remove("Kate");
        System.out.println("\nAfter removing the key:");
        for(Entry<String, String> entry: myHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
        
        System.out.println("Do we have 'Basil'? " + myHashMap.containsKey("Basil"));
        System.out.println("Do we have 'Victoria'? " + myHashMap.containsKey("Victoria"));
        
        System.out.println("Do we have a value'12.10.1971'? " + myHashMap.containsValue("12.10.1971"));
        System.out.println("Do we have a value 'lalala'? " + myHashMap.containsValue("lalala"));
        
        System.out.println("The size of map is " + myHashMap.size());
        
        for(String name : myHashMap.keySet()) {
        	System.out.println("name = " + name + " value = " + myHashMap.get(name));
        }
 	}
	
	public void linkedHashMapExample() {
		LinkedHashMap<String, String> myLinkedHashMap = new LinkedHashMap<String, String>();
		 
        myLinkedHashMap.put("Basil", "07.12.1987");
        myLinkedHashMap.put("Kate", "12.10.1971");
        myLinkedHashMap.put("Lena", "11.01.1991");
        
        for(Entry<String, String> entry: myLinkedHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
        
        System.out.println("The value for 'Basil' is " + myLinkedHashMap.get("Basil"));
        
        System.out.println("Before removing a key:");
        for(Entry<String, String> entry: myLinkedHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
 
        myLinkedHashMap.remove("Kate");
        System.out.println("\nAfter removing the key:");
        for(Entry<String, String> entry: myLinkedHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
        
        System.out.println("Do we have 'Basil'? " + myLinkedHashMap.containsKey("Basil"));
        System.out.println("Do we have 'Victoria'? " + myLinkedHashMap.containsKey("Victoria"));
        
        System.out.println("Do we have a value'12.10.1971'? " + myLinkedHashMap.containsValue("12.10.1971"));
        System.out.println("Do we have a value 'lalala'? " + myLinkedHashMap.containsValue("lalala"));
        
        System.out.println("The size of map is " + myLinkedHashMap.size());
 	}
	
	public void iterateMapExemple() {
		HashMap<String, String> myHashMap = new HashMap<String, String>();
		 
		myHashMap.put("Basil", "07.12.1987");
		myHashMap.put("Kate", "12.10.1971");
		myHashMap.put("Lena", "11.01.1991");
		
        Iterator<Map.Entry<String, String>> itr = myHashMap.entrySet().iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
	}
	
	public void loopMapExample() {
		HashMap<String, String> myHashMap = new HashMap<String, String>();
		 
		myHashMap.put("Basil", "07.12.1987");
		myHashMap.put("Kate", "12.10.1971");
		myHashMap.put("Lena", "11.01.1991");
		
        for (String name : myHashMap.keySet())  
        { 
           System.out.println("Key = " + name + ", Value = " + myHashMap.get(name)); 
        } 
	}
}
