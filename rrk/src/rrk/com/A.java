package rrk.com;

/*class Bank{
	float balance=5000.00f;
	synchronized void withdraw(float amount) {
		try {
			System.out.println("Withdraw Starts");
			if(balance<amount) {
				System.out.println("less Balance,Waiting for deposit");
				wait();
			}
			
				balance=balance-amount;
				System.out.println("withdraw completed");
			
		}catch (Exception e) {
			System.err.println();// TODO: handle exception
		}
	}
	
	synchronized void deposit(float amount) {
		System.out.println("Deposit started");
		balance=balance+amount;
		System.out.println("Deposit Completed");
		notifyAll();
	}
}
class Customer1 extends Thread{
	Bank b;
	Customer1(Bank b){
		this.b=b;
	}
	public void run() {
		b.withdraw(5000.00f);
	}
}
class Customer2 extends Thread{
	Bank b;
	Customer2(Bank b){
		this.b=b;
	}
	public void run() {
		b.deposit(5000.00f);
	}
}

class A {
	public static void main(String[] args) {
		Bank b=new Bank();
		Customer1 c1=new Customer1(b);
		c1.start();
		Customer2 c2=new Customer2(b);
		c2.start();
	}
}*/
