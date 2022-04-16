package vk;

class A
{
	class B
	{
		void m1()
		{
			System.out.println("m1-B");
		}
		void m2()
		{
			System.out.println("m2-B");
		}
	}
	class C extends B
	{
		void m3()
		{
			System.out.println("m3-C");
		}
		void m4()
		{
			System.out.println("m4-C");
		}
	}
}