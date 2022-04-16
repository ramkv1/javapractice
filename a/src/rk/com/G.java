package rk.com;

class G {
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("Durga ");
		StringBuffer sb2=sb1.append("software ");
		StringBuffer sb3=sb2.append("solution");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb2);
		System.out.println(sb1.delete(5,23));
	}
}
