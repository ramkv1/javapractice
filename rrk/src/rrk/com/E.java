package rrk.com;

import java.util.Scanner;

public class E {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String x=s.next();
		switch (x) {
		case "mon":
			System.out.println("Monday");
			break;
		case "Tue":
			System.out.println("Thuseday");
		    break;
		default:
			System.out.println("invalid");
			break;
		}
		}
}
