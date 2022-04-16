package rrk.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		for(int i=0;i<str.length();i++) {
			if(i==2) {
				continue;
			}
			else if(i==6) {
				continue;
			}
			System.out.println(i);
		}
	}
	
}
