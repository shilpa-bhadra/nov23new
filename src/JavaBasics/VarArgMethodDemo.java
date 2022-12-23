package JavaBasics;

public class VarArgMethodDemo {
	//var arg method are methods with 'n' number of parameters
	//whatever the no of parameters that  method is executed which has vararg method name 
	//''''''''In a single class we can take only one varArg method''''''''//
	public void hello(String...str) {
System.out.println("var Arg method");
	}
public void hello() {
	System.out.println("hello method without parameter that same method is executed");

}

	
	
	
	public static void main(String[] args) {
		//for any number of parameter this hello method is executed
		VarArgMethodDemo VarArgMethodDemo1 = new VarArgMethodDemo();
		VarArgMethodDemo1.hello();//as hello method with zero parameter is existing so this method is executed
		VarArgMethodDemo1.hello("java");
		VarArgMethodDemo1.hello("java");
		VarArgMethodDemo1.hello("java","selenium");
		VarArgMethodDemo1.hello("java","method","thinked");
	}

}
