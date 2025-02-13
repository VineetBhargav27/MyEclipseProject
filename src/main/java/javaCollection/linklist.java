package javaCollection;

import java.util.LinkedList;

public class linklist {

	public static void main(String[] args) {
		LinkedList ls= new LinkedList(); 
		//LinkedList <Integer>l= new LinkedList<Integer>();
          ls.add(100);
          ls.add(true);
          ls.add(null);
          ls.add("welcome");
          ls.add("to");
          ls.add(2, "hi");
          System.out.println(ls);
          //System.out.println(ls.size());
         //remove
          //ls.remove(3);
          System.out.println(ls.get(2));
          //System.out.println("after removing , new list	:"+ ls);
          ls.set(3, "out");
          System.out.println("after set , new list"+ ls);
          //for each loop
          for(Object  e:ls) {
        	  System.out.println(e);
          }
          
          
	}

}
