package vk.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class D2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int n=Integer.parseInt(br.readLine());
	    
	    List<WeightCouple> list1=new ArrayList<WeightCouple>();
	       String[] str1=      br.readLine().split(" ");
	       String[] str2=      br.readLine().split(" ");
			for(String s:str1) {
				list1.add(new WeightCouple(Integer.parseInt(s), false));
			}
			for(String s:str2) {
				list1.add(new WeightCouple(Integer.parseInt(s), true));
			}
			
			List<WeightCouple> list2=	list1.stream().sorted(Comparator.comparing(WeightCouple::getValue)).collect(
				Collectors.toList());
			boolean b=false;
			int count =0;
			  List<WeightCouple> list3=new ArrayList();
			
			for(WeightCouple wc:list2) {
				if(wc.isB()==b) {
					b=!b;
					list3.add(wc);
				}
			}
			
			list3.stream().forEach(p->System.out.print(p.getValue()+" "+p.isB()+", "));
			
			 //12 33 16 23 53 77
			//19 58 25 47 93 99
	}
	
	
	
	
	
}
class WeightCouple{
	private Integer value;
	private boolean b;

	public WeightCouple(Integer value, boolean b) {
		super();
		this.value = value;
		this.b = b;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public boolean isB() {
		return b;
	}
	public void setB(boolean b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "WeightCouple [value=" + value + ", b=" + b + "]";
	}	
}
