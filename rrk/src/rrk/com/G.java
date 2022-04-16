package rrk.com;

@FunctionalInterface
interface Test1{
	
	void get();
	default void print() {
		
	}
}
@FunctionalInterface
interface Test2 extends Test1{
	default void get() {
		
	}
	void get1();
}

class G{
	public static void main(String[] args) {
		
	}
}