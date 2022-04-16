package vk.com;
abstract class A{
	
	A(){
		System.out.println("abstract constructor");
	}
	abstract void add();
	abstract void show();
	void print()
	{
		System.out.println("print method");
	}
}

class Bb extends A{
	void show() {
		System.out.println("show method");
	}
	void add() {
		System.out.println("add method");
	}
}
class Demo{
	public static void main(String[] args) {
		A b =new Bb();
		b.show();
		b.print();
		b.add();
		
	}
}
