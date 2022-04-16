package vk.com;

import java.util.*;

class Array
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) 
		{
			array[i] = s.nextInt();
		}
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + ",");
		}
	}
}
