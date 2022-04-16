package rrk.com;

//Encapsulation
class Student{
	int rollno;
	String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class J{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("Ramakrishna");
		s1.setRollno(101);
		System.out.println(s1.getName());
		System.out.println(s1.getRollno());
	}
}
