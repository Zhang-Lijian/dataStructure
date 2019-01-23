package loopAndDigui;

import java.util.Date;

public class DiguiDemo {
	public  static void print(int n) {
		if(n>0) {
			System.out.println(n);
			print(--n);
			
		}
		
	}
	public static void main(String[] args) {
		Date date1 = new Date();
		
		print(10000);
		Date date2 = new Date();
		System.out.println(date2.getTime()-date1.getTime()+"毫秒");
	}

}
