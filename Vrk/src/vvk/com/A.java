package vvk.com;

public class A {
	int i = m1();

	A() {
		System.out.println("A-con");
	}

	int m1() {
		System.out.println("M1-A");
		return 10;
	}

}

class B {
	int j = m1();

	int m2() {
		System.out.println("m2-A");
		return 10;
	}

	B() {
		System.out.println("A-con");
	}

	int m1() {
		System.out.println("m1-A");
		return 20;
	}

	int i = m2();
}

class C {
	C() {
		System.out.println("A-con");
	}

	{
		System.out.println("IB-A");
	}
}

class D {
	D() {
		System.out.println("D-Con");
	}

	{
		System.out.println("IB-D");
	}

	int m1() {
		System.out.println("m1-D");
		return 10;
	}

	int i = m1();
}
