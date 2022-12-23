package JavaBasics;

public class OverLoadingDemo {
//overloading same method name with different parameters
	
private void add(int a) {
	System.out.println(a);

}
private void add(int a,int b) {
	System.out.println(a+b);

}
private void add(int a,int b,int c) {
	System.out.println(a+b+c);

}

	public static void main(String[] args) {
		OverLoadingDemo demo = new OverLoadingDemo();
		demo.add(2);
		demo.add(2, 2);
		demo.add(2, 1, 1);
	}

}
