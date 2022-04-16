package vk.com;
import java.util.*;
public class Di {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] A=new int[N];
        int genum=0,d=0;
        for(int i=0;i<N;i++)
        {
            A[i]=s.nextInt();
        }
        for(int i=N/2;i<N;i++) {
        		int r=A[i]%10;
        		genum=genum*10+r;
        }
        for(int i=0;i<N/2;i++) {
        	while (A[i] >= 10)
               d=A[i]/10;
        	genum=genum*10+d;
        }
        System.out.println(genum);
       }
}
