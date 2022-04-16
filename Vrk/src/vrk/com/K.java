package vrk.com;

public class I {
	 void m1()
	{
		System.out.println("m1-A");
		
	}
}
class B extends I
{
	void m1()	
	{
		System.out.println("m1-B");
		
	}
}
class K {
	public static void main(String []args) {
   I a=new I();
    a.m1();
      
	}
}
