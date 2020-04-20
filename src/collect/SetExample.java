package collect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public void setExample() {
		
		Set<String> department = new HashSet<>();
		List<String> bigDepartment = new ArrayList<>();
		
		bigDepartment.add("hfh");
		bigDepartment.add("hfh");
		bigDepartment.add("aaa");
		bigDepartment.add("bbb");
		bigDepartment.add("hfh");
		
		
		for(String person : bigDepartment) {
			department.add(person);
		}
		
//		department.add("vvv");
//		department.add("aaa");
//		department.add("bbb");
//		department.add("SSS");

		for (String person : department) {
			System.out.println(person);
		}
		
		Set<Integer> myHashSet = new HashSet<>();
		
		myHashSet.add(3);
		myHashSet.add(2);
		myHashSet.add(1);

		for (int i : myHashSet) {
			System.out.println(i);
		}

		System.out.println("Before remove:");
        for (int i : myHashSet)
            System.out.println(i);
 
        myHashSet.remove(3);
        System.out.println("After remove:");
        for (int i : myHashSet)
            System.out.println(i);
        
        System.out.println("Does myHashSet contain '1'? " + myHashSet.contains(1));
        System.out.println("Does myHashSet contain '11'? " + myHashSet.contains(11));
       
        System.out.println("Now myHashSet size is " + myHashSet.size());
        
        myHashSet.clear();
        System.out.println("After clear myHashSet size is " + myHashSet.size());
        System.out.println("After clear myHashSet is empty: " + myHashSet.isEmpty());
        
        String str1="fgfgfg";
        System.out.println("String is empty: " + str1.isEmpty());
        
	}
	
	public void linkedSetExample() {
		LinkedHashSet <Integer> myLinkedHashSet = new LinkedHashSet <Integer>();
		myLinkedHashSet.add(5);
		myLinkedHashSet.add(22);
		myLinkedHashSet.add(2);

		for (int i : myLinkedHashSet) {
			System.out.println(i);
		}

		System.out.println("Before remove:");
        for (int i : myLinkedHashSet)
            System.out.println(i);
 
        myLinkedHashSet.remove(22);
        System.out.println("After remove:");
        for (int i : myLinkedHashSet)
            System.out.println(i);
        
        System.out.println("Does myLinkedHashSet contain '1'? " + myLinkedHashSet.contains(1));
        System.out.println("Does myLinkedHashSet contain '11'? " + myLinkedHashSet.contains(11));
        
        System.out.println("Now myLinkedHashSet size is " + myLinkedHashSet.size());
        
        myLinkedHashSet.clear();
        System.out.println("After clear myLinkedHashSet size is " + myLinkedHashSet.size());
        
        System.out.println("After clear myLinkedHashSet is empty: " + myLinkedHashSet.isEmpty());
	}
	
	public void treeSetExample() {
		TreeSet<Integer> myTreeSet = new TreeSet<Integer>();
		myTreeSet.add(5);
		myTreeSet.add(22);
		myTreeSet.add(1);

		for (int i : myTreeSet) {
			System.out.println(i);
		}

		System.out.println("Before remove:");
        for (int i : myTreeSet)
            System.out.println(i);
 
        myTreeSet.remove(22);
        System.out.println("After remove:");
        for (int i : myTreeSet)
            System.out.println(i);
        
        System.out.println("Does myTreeSet contain '1'? " + myTreeSet.contains(1));
        System.out.println("Does myTreeSet contain '11'? " + myTreeSet.contains(11));
        
        System.out.println("Now myTreeSet size is " + myTreeSet.size());
        
        myTreeSet.clear();
        System.out.println("After clear myTreeSet size is " + myTreeSet.size());
        
        System.out.println("After clear myTreeSet is empty: " + myTreeSet.isEmpty());
	}
	
	public void iterateSetExample() {
		HashSet<Integer> myHashSet = new HashSet<Integer>();
		myHashSet.add(1);
		myHashSet.add(2);
		myHashSet.add(3);
		
		Iterator<Integer> iterator = myHashSet.iterator();

		while (iterator.hasNext())
		{
		 int item = iterator.next();
		 System.out.println("item = " + item);
		}
	}
}
