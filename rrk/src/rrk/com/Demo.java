package rrk.com;

class Test implements Runnable{
	synchronized public void run() {
		
			try {
				for(int i=0;i<=10;i++) {
					System.out.println("javaEE");
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
class Demo implements Runnable{
	synchronized public void run() {
		try {
			for(int i=0;i<=10;i++) {
				System.out.println("Core Java");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			System.err.println(e);// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		try {
			Runnable r=new Demo();
			Thread t=new Thread(r);
			t.start();
			Runnable r2=new Test();
			Thread t2=new Thread(r2);
			t2.start();
			for(int i=1;i<=10;i++) {
				System.out.println("Advance java");
				Thread.sleep(3000);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
