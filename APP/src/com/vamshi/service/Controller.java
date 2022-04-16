package com.vamshi.service;

public class Controller {
  
	 private  static int number=10;
	
	static {
		System.out.println("static block "+number);
	}
	
	public Controller() {
		System.out.println("controller constructor");
	}
	
	public Long  Controller(Long number,String name) {
	return number;
	}
	/*def __init__() {
	}*/
	
	public void add() {
		System.out.println("423432");
		return;
	}
	
	
	public static void add01() {
		System.out.println("Controller -Static method");
		return;
	}
}
