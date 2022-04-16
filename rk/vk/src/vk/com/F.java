package vk.com;

class F {
	public static void main(String[] args) {
		F.D fd=new F.D();
		fd.m2();
	}

	void m1() {
		System.out.println("m1-method");
	}

	static class D {
		static final int i = 20;

		void m2() {
			System.out.println("m2-method");
			System.out.println(i);
		}
	}
}
