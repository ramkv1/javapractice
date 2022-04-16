package vk.com;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.imageio.event.IIOReadProgressListener;
class D3 {
    public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		String[] strArr= br.readLine().split("");
		java.util.List<Integer> listnumber =new ArrayList<Integer>();
		for(String s:strArr) {
			listnumber.add(Integer.parseInt(s));
		}
		for(int i=0;i<listnumber.size();i++) {
			System.out.println(i);
		}
	}
}