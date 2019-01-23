package loopAndDigui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderAnArray {
	
	public static ArrayList<Integer> order(ArrayList<Integer> a) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(a.size()>0) {
			list.add(min(a));
			Object b=min(a);
//			因为remove方法参数有object和int区分 
			a.remove(min(a));
		}
		
		
		return list;
	}
	public static int min(ArrayList<Integer> list) {
		int min=list.get(0);
		for(int i=0;i<list.size();i++) {
			if(list.get(i)<min) {
				min=list.get(i);
			}
		}
		return min;
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>( Arrays.asList(10,4,5,7,2,3,1,6,9,8));
		
		System.out.println(order(list));

	}

}
