package loopAndDigui;

import java.util.Date;

public class LoopDemo {
	public  static void print(int n) {
		for(int i=0;i<n;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Date date1=new Date();
		print(100000);
		
		Date date2=new Date();
		System.out.println(date2.getTime()-date1.getTime()+"毫秒");
	}

}
