package rrk.com;

class Bank{
	float balance=5000.00f;
	synchronized void withdraw(float amount)
	{
		try {
			System.out.println("Withdraw Started");
			if(balance<amount) {
				System.out.println("less Balance,waiting for deposit");
				wait();
			}
			balance=balance-amount;
			System.out.print("Withdraw compeleted");
		}catch (Exception e) {
			System.err.println();// TODO: handle exception
		}
	}
	synchronized void deposit(float amount) {
		try {
			System.out.println("Deposit Started");
			balance=balance+amount;
			System.out.println("Deposite completed");
			notify();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
class customer extends Thread{
	Bank b;
	customer(Bank b){
		this.b=b;
	}
	public void run()
	{
		b.withdraw(8000.00f);
	}
}
class customer1 extends Thread{
	Bank b;
	customer1(Bank b){
		this.b=b;
	}
	public void run()
	{
		b.deposit(5000.00f);
	}
}
class B{
	public static void main(String[] args) {
		Bank b=new Bank();
		customer c=new customer(b);
		c.start();
		customer1 c1=new customer1(b);
		c1.start();
	}
}
