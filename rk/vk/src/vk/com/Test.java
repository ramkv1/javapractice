package vk.com;
class K{
	int a=30;
}
class G extends K{
	int a=10;
	void m1() {
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
class Test{
	public static void main(String[] args) {
		G g=new G();
		g.m1();
	}
}