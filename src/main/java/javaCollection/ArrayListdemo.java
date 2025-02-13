package javaCollection;

import java.util.ArrayList;

public class ArrayListdemo {

	public static void main(String[] args) {
	//declare ArrayList
		//ArrayList al= new ArrayList();
		//ArrayList <Integer> al= new ArrayList<Integer>();
        //ArrayList <String>al = new Arrraylist<String>();
		ArrayList al= new ArrayList();
	    //add new elements to array list
		al.add(100);
	     al.add("welcome");
	     al.add(10.4);
	     al.add(true);
	    System.out.println(al);
	    System.out.println(al.get(3));
	    al.set(2,"rew");
	    System.out.println("after replace" +al);
	    System.out.println(al.contains(10));
	}    
}
	
	
	


