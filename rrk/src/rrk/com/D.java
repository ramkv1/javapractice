package rrk.com;

class D {
	void display(int... a) {
		for(int b:a) {
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		D d=new D();
		d.display(10,20,30,40,50);
		d.display(10,20,30,40);
	}
}
