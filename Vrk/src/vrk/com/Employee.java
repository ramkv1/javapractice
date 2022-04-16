package vrk.com;

class Employee{
	String eid;
	String ename;
	float esal;
	String eaddr;
	
	
	Employee(String emp_id,String emp_name,float emp_salary,String emp_addr){
		eid=emp_id;
		ename=emp_name;
		esal=emp_salary;
		eaddr=emp_addr;
	}
	public void getEmpDetails() {
		System.out.println("Employee Details");
		System.out.println("---------------");
		System.out.println("Employee id:"+eid);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee salary:"+esal);
		System.out.println("employee address:"+eaddr);
	}
}


	