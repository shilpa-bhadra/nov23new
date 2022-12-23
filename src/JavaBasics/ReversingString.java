package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
public class ReversingString {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
	String name ="Selenium";
	
	for(int i=name.length()-1;i>=0;i--) {
		
		char revname = name.charAt(i);
		System.out.println(revname);
		

	}
	
	
	
	}

}
