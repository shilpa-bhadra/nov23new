package JavaBasics;


//inheritence we are using at class level


public class InheritenceDemo {

	public  void sample() {
		System.out.println("class 1");

	}
	
	class A {
		
		public  void sample() {
			System.out.println("class 2");

		}
		
	}
	class B extends A{
		
		public  void sample() {
			System.out.println("class 3");

		}
		
	}
	public static void main(String[] args) {
		
		InheritenceDemo id = new InheritenceDemo();
		id.sample();
	}

}
