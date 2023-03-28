package week6.day2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class MapPractise {
	
	@Test
	public void mapPractise()
	{
		//Map<String, String> map = new TreeMap<String,String>(); //It maintains ascending order based on key. no null keys n values
		//Map<String, String> map = new HashMap<String,String>(); //but it doesn't maintain any order, allows nulls
		Map<String, String> map = new LinkedHashMap<String,String>(); //It maintains insertion order.Allow nulls
		map.put("1", "Vince");
		map.put("2", "Vijay");
		map.put("3", "Debby");
		map.put("4", "Marvela");
		map.put("4", "Marvelas");
		System.out.println(map);
		System.out.println(map.get("1"));
		//traversing map is not possbible, need to convert it to Set
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
		
			System.out.println(entry.getValue());
		}
		
		
	}

}
