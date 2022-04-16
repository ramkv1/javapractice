package com.wipro.terrorist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

interface Vechile{
	default void m1() {
		System.out.println("default Method");
	}
	static void staticmethod() {
		System.out.println("vdfsdfasd");
	}
}
class Car implements Vechile{
	
}

public class MainClass{
	
	public static void main(String[] args) {
		//Vechile h=new Car();
		Vechile.staticmethod();
		
		
		List<Integer> list=Arrays.asList(1,2,3,4,4,453,24,32,432,4,32,4,32,432,4,23,4);
		List<String> listStr=Arrays.asList("habdbjhas","sadasd","asdasd","asdasd","sadsadsa");
		
	Map<Integer,Long> map=	list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
	System.out.println(map.entrySet());
	
	
	MapFunction mapfunction=new MapFunction();

	
	
	
	
	
	
	
		
		
	}
}

class MapFunction implements Function<String, String>{
	static int count=0;
	@Override
	
	public String apply(String t) {
		count++;
		
		return t+""+count;
	}
}