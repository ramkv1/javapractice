package rrk.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Hh{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		System.out.println(str);
	}
}