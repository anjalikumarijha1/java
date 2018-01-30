package Day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist_example {
	
	public static void main(String[] args) {
		
	List<String> ls1 = new ArrayList<String>();
		
		ls1.add("orange");
		ls1.add("mango");
		ls1.add("apple");
		ls1.add("banana");
		ls1.add("pineapple");

	List<String> ls2 = new ArrayList<String>();
		
		ls2.add("orange");
		ls2.add("grapes");
		ls2.add("apple");
		ls2.add("banana");
		ls2.add("kiwi");
	
		
		Iterator<String> it = ls1.iterator();
		
		while(it.hasNext()){
			String val = it.next();
			
			if(ls2.contains(val)==false){
				System.out.println(val);
			}
				
		}
		
		
		
		
		
		
		
		
		
		
	}
}
