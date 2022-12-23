package JavaBasics;

//declaration in class and execution is by calling the method

public class AdditionExp2 {

	public void add() {
		int a=4;
		int b=4;
		int c=a+b;
		System.out.println(c);
	}
	public void sub() {

		int a=14;
		int b=4;
		int c=a-b;
		System.out.println(c);
	}
	public void mul() {
		int g=5;
		int h=4;
		int i=g*h;
		System.out.println(i);
	}
	public void div() {
		int j=4;
		int k=4;
		int c=j/k;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		
		AdditionExp2 exp2 = new AdditionExp2();
		exp2.add();
		exp2.div();
		exp2.sub();
		exp2.mul();
		
	}

}
