package JavaBasics;

public class MethodDemo {

	public void getData() {
		System.out.println("this is a method");

	}
	
public  String getDataWithReturnType() {
	
	return "this is a return method";
	// TODO Auto-generated method stub

}	
	
	
	public static void main(String[] args) {
		
		MethodDemo md = new MethodDemo();//we can access a method by creating an object
		md.getData();
		String req = md.getDataWithReturnType();
		System.out.println(req);
		
		//accessing MethodDemo2 class methods 
		MethodDemo2 md2 = new MethodDemo2();
		md2.demo();
		md2.getdemo();
	}

	

}
