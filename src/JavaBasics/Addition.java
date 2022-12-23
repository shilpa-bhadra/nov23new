package JavaBasics;

public class Addition {

	public static int add(int a,int b) {
		/*
		 * int a=3; int b=4; System.out.println(a+b); return a+b;
		 */
		int c=a+b;
		System.out.println(c);
		return c;
		
	}
	public static void main(String[] args) {
		
		/*
		 * Addition addobj = new Addition();
		 * 
		 * addobj.add();
		 */
		Addition.add(2,4);
		
		
	}

}
