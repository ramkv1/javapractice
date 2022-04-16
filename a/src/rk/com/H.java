package rk.com;

abstract class H {
	void m1() {
		System.out.println("m1-A");
	}
	abstract void m2();
	abstract void m3();
}
class HH extends H
{
	void m2() {
		System.out.println("m2-HH");
	}
	 void m3() {
		 System.out.println("m3-HH");
	}
	
	void m4() {
		System.out.println("m4-HH");
	}
}