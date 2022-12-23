package JavaBasics;

import java.util.ArrayList;

@SuppressWarnings("rawtypes")
public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add("selenium");
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		//System.out.println(al1);
		//""""""""""""""""//
		ArrayList al2 = new ArrayList();
		al2.addAll(al1);
		//System.out.println(al2);
	
		//System.out.println(al2.get(0));
		//System.out.println(al2.clone());
		//System.out.println(al1.get(0));
		
		System.out.println(al1.indexOf("selenium"));
		
		
	}

}
