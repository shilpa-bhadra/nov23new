package JavaBasics;

import java.util.ArrayList;

public class MultipleValuesInArray {
	//Write a method to return multiple values
	//only returning odd values
	//adding multiple values in a array
	public void oddValues(int a,int b) {
	
		//i want odd numbers between a to b start a as 0 and b =9
		
		
		ArrayList listOfOddNumbers = new ArrayList();
		for(int i=a;i<=b;i++) {
			
			if(i%2==1) {
				
				//System.out.println(i);
				listOfOddNumbers.add(i);
			}
			
			
		}
		
		//listOfOddNumbers.toArray();
		System.out.println(listOfOddNumbers);
		
		

	}
	
	
	public static void main(String[] args) {
		
		MultipleValuesInArray result = new MultipleValuesInArray();
		
		
		result.oddValues(0, 9);
		
		
	}

}
