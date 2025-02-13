package javaCollection;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
	HashSet  set= new HashSet();
	set.add(1);
	set.add(7);
	set.add(8);
	set.add(1);
	set.add("add");
	set.add(null);
	
	
	set.add(8);
	set.remove(null);
	boolean status=set.contains("add");
	System.out.println(status);
	System.out.println(set);
	//convert Hastset to Arraylist
	ArrayList al= new ArrayList(set);
	System.out.println(al);
	System.out.println(al.get(2));
	
	}

}
