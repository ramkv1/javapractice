package com.vamshi.service;

public class Service {

	public static void main(String[] args) {
		Controller.add01();
		Controller controller = new Controller();
		System.out.println(controller.Controller(3467890045666666789l, "vamshi"));
		controller.add();
		int i = 10;
		Integer integer = 100;
		String numberString = integer.toString();
		System.out.println(numberString.getBytes());
		System.out.println(numberString);

		System.out.println(controller.hashCode());
		integer.getClass().getName();
		int a = 10;
		int b = 20;
		if ((a++ != 10) & (b++ != 10)) {
			System.out.println(a + " " + b);
		}
		int c = 10;
		int d = 10;
		if ((c++ != 10) && (d++ != 10)) {
			System.out.println(c + " " + d);
		}
	}
}
