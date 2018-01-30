package Day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
	
public static void main(String[] args) {
		
		List<String> ls = new LinkedList<String>();
		
		ls.add("orange");
		ls.add("mango");
		ls.add("orange");
		ls.add("apple");
		ls.add("banana");
		ls.add("pineapple");
		ls.add("mango");
		
//		for loop
		for(int i = 0; i<ls.size();i++){			
			System.out.println(ls.get(i));				
		}
		
		System.out.println("------------------");
		
//		for each
		for(String xyz : ls){
			System.out.println(xyz);			
		}
		
		System.out.println("------------------");
		
//		iterator
		
		Iterator<String> it = ls.iterator();
		
		while(it.hasNext()){
			
			String val = it.next();
			System.out.println(val);	
			
		}
		
		
		
		
		
	}

	
	
	
	
	

}
