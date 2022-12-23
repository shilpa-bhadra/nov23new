package JavaBasics;

import java.util.HashMap;

@SuppressWarnings("rawtypes")
public class HashMapDemo {

	//In HashMap we can write the data in the form of key value pairs
	
	
	
	
	public static void main(String[] args) {
		HashMap hm1 = new HashMap();
		hm1.put("username", "shilpa");
		hm1.put("password", "remo@123");
		System.out.println(hm1.get("username"));
		System.out.println(hm1.get("password"));

	}

}
