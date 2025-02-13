package javaCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class Hashmap {

	public static void main(String[] args) {
		//HashMap m =new HashMap();
		HashMap <Integer,String> m= new HashMap<Integer,String>();
		m.put(101,"david");
		m.put(102, "john");
		m.put(103, "joy");
		m.put(104, "jnny");
		m.put(105, "suny");
		System.out.println(m); //{101=david, 102=john, 103=joy, 104=jnny, 105=suny}
		System.out.println(m.get(103));//get 103 	
		System.out.println(m.containsKey(103));
		System.out.println(m.remove(102));
		m.put(102, "yun");
		System.out.println(m.containsKey(102));
		System.out.println(m.isEmpty());
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		System.out.println(m.entrySet());
		 
		for(Object i:m.values()) {
			 System.out.println(i);
		 }
		
		
		for(Map.Entry entry:m.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
			
		}
		
		//using Iterator method
		 Set s=m.entrySet();
		Iterator itr= s.iterator();
		
	
	
	}
	

}
