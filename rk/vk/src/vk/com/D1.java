package vk.com;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class D1{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N= Integer.parseInt(br.readLine());
		String[] eleStrs=br.readLine().split(" ");
		List<Integer> list=new ArrayList();
		for(int i=0;i<N;i++) {
			String s=eleStrs[i];
			
			if(i<N/2) {
			  	list.add(Integer.parseInt(Character.toString(s.charAt(0))));
			}else {
				list.add(Integer.parseInt(Character.toString(s.charAt(s.length()-1))));
			}
		}
		StringBuffer numberstr=new StringBuffer();
		for(Integer n :list) {
		      numberstr=numberstr.append(n.toString());	
		}
		
		int desire=Integer.parseInt(numberstr.toString());
		if(desire%11==0) {
			System.out.println("OUI");
		}else {
			System.out.println("NON");
		}	
	}
}
