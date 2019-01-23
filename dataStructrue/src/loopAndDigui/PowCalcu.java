package loopAndDigui;

public class PowCalcu {

	public static void main(String[] args) {
		try {
			throw new NullPointerException("error");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(normal(2,3));
		System.out.println(pow(2,20));

	}
	public static long normal(int x,int n) {
		long sum = 0;

		int i=0;
		while( i<=n) {
			sum+=Math.pow(x, i);

			i++;
		}
		return sum;
	}
	public static long pow(long x,int n) {
		if(n==0)
			return 1;
		if(n%2==0&&n!=0)
			return pow(x*x,n/2);
		else
			return pow(x*x,n/2)*x;
	}
}
