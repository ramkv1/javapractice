package rrk.com;

import java.util.Scanner;

class NegaviteNumberException extends RuntimeException{
	
}
class C{
	
		void cube(int a) throws NegativeArraySizeException
		{
			if(a>0) {
				System.out.println(a*a*a);
			}
			else {
				throw new NegaviteNumberException();
			}
		}
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			//System.out.println("Enter a number");
			int x=s.nextInt();
			C c=new C();
			c.cube(x);
		}
}
