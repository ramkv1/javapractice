package rrk.com;

interface Vechile{
	default void m1() {
		System.out.println("default Method");
	}
}
class Car implements Vechile{
	
}

public class MainClass{
	
	public static void main(String[] args) {
		Vechile h=new Car();
		
	}
}