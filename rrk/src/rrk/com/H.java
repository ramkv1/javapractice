package rrk.com;

import java.io.*;
class H{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		if(str.charAt(2)=='A'||
				str.charAt(2)=='E'||
				str.charAt(2)=='I'||
				str.charAt(2)=='O'||
				str.charAt(2)=='U'||
				str.charAt(2)=='Y') {
			for(int i=0;i<str.length();i++) {
				int x=Integer.parseInt(str);
				System.out.println(x);
			}
		}
		else {
			System.out.println("invalid");
		}
	}
}