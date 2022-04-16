package com.pretups;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputSxttreamReader(System.in));
		int testcases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < testcases; i++) {
			String str1 = sc.nextLine();
			String str2[] = str1.split(" ");
			int n = Integer.parseInt(str2[0]);
			int m = Integer.parseInt(str2[1]);
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < n; k++) {

				}
			}
		}
	}
}
