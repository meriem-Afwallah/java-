package hello;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapMain {

	public static void main(String[] args) {
		HashMap<String, String> myMap = new HashMap<String, String>();
		
		myMap.put("thomas", "le formateur");
		myMap.put("m2i", "le centre de formation");
		
		System.out.println(myMap.get("thomas"));
		System.out.println(myMap.get("m2i"));
		
		HashMap<String,String> colors = new HashMap<String, String>();
		colors.put("white", "#FFFFFFF");
		colors.put("black", "#000000");
		colors.put("red", "#00FF00");
		colors.put("green", "#000000");
		colors.put("blue", "#000000");
		
		System.out.println(colors.get("green"));
		
		
		for (Entry<String, String>entry : colors.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}
		
				

	}

}
