package rk.com;

class C {
int i=10;
static int j=20;
static {
	System.out.println("SB-A");
	//System.out.println(i);
	A a=new A();
	System.out.println(a);
	System.out.println(j);
	//System.out.println(this.j);
}
}
