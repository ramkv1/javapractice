package vk.com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
class Emp{
	int empno=101;
	float empsalary=100000000.00f;
}
class D4{
	public static void main(String[] args) {
		try {
			Emp e=new Emp();
			FileOutputStream fos=new FileOutputStream("emp .txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(e);
			oos.close();
			fos.close();
		}catch ( Exception e) {
			System.err.println();// TODO: handle exception
		}
	}
}