package JavaBasics;
@SuppressWarnings("unused")
class Parent{
	
	public void play() {
		System.out.println("we  want to play");

	}
	public void study() {
		
		System.out.println("we want to study");
	}
	public void job() {
		
		System.out.println("we want  job");
	}
	
}

class Child extends Parent{
	
	@Override
	public void study() {
		System.out.println("we don't want to study");

	}
	
	public void entertainment() {
		System.out.println("we  want entertainment");

	}
	
	
	
	
}

public class OverridingDemo {
//we cannot override private methods
	//method signature should be same means same method name and same parameters
	//in order to override a method that method should be in child class
	//in order to override a method that method shoule extend the parent class
	
	
	public static void main(String[] args) {
		Child parent = new Child();
		
		parent.play();
		parent.study();
		parent.job();
		
		
		//with child reference we can access both child and parent class and child overrides the parent method
		//console answer is below
		/*
		 * we want to play 
		 * we don't want to study
		 *  we want job
		 */
		
Parent parent1 = new Parent();
		
		parent1.play();
		parent1.study();
		parent1.job();
		
		//with parent reference we can access only parent specified objects
		/*
		 * we want to play 
		 * we want to study 
		 * we want job
		 */
		
		//in overriding method resolution happens in reference type and method execution  happen in runtime object
		
		//Method hiding: In order to do method hiding parent and child should be of type static
	}

}
