package vk.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp1 implements Serializable {
	int empno = 101;
	transient int empsalary = 1000000;
}

public class D5 {
	public static void main(String[] args) {
		try {
			Emp1 emp1 = new Emp1();
			FileOutputStream fos = new FileOutputStream("emp1.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp1);
			oos.close();
			fos.close();
			FileInputStream fis = new FileInputStream("emp1.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Emp1 emp2 = (Emp1) ois.readObject();
			System.out.println(emp2.empno + emp2.empsalary);
			ois.close();
			fis.close();
		} catch (Exception e) {
			System.err.println(e);
		}

	}
}
