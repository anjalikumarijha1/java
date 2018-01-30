package Day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Treemaps {
	
	public static void main(String[] args) {
		
		
		new HashMap<String,HashMap<String,ArrayList<String>>>();
		
		
		
		Map<String, String> hm = new TreeMap<String,String>();
		
		hm.put("india", "1");
		hm.put("India", "1");
		hm.put("1india", "1");
		hm.put("china", "2");
		hm.put("pakistan", "3");
		hm.put("nepal", "4");
		hm.put("bhutan", "5");
		hm.put("srilanka", "6");
		hm.put("bhutan", "6");
		hm.put("china", "8");
		
		
		Iterator<String> it = hm.keySet().iterator();
		
		while(it.hasNext()){
			String key = it.next();
			
			System.out.println("key is :" + key + " and value is " + hm.get(key));
			
			
			
		}
		
		
		
		
		
		
		
		
	}
}
