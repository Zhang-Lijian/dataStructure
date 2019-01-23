package loopAndDigui;

import java.util.Scanner;

public class BinarySearch {
	public static long search(int n, int s) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i;
		}
		long t1 = System.currentTimeMillis();
		int left = 0, right = n - 1;
		int middle = (left + right) / 2;
		int count = 1;
		while (true) {
			if (s < a[middle]) {
				right = middle;
			} else if (s == a[middle]) {
				System.out.println("s在第" + middle + "个位置");
				break;
			} else {
				left = middle;
			}
			middle = (left + right) / 2;
			count++;
		}
		long t2 = System.currentTimeMillis();
		System.out.println("一共查了" + count + "次");
		return t2 - t1;

	}

	public static long search2(int n, int s) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i;
		}
		long t1 = System.currentTimeMillis();
		int count = 1;
		for (int i = 0; i < n; i++) {
			if (s == a[i]) {
				System.out.println("s在第" + i + "个位置");
				break;
			}
			count++;
		}
		long t2 = System.currentTimeMillis();
		System.out.println("一共查了" + count + "次");
		return t2 - t1;

	}

	public static void main(String[] args) {

		System.out.println(search(100000000, 21888999));
		System.out.println(search2(100000000, 21888999));

	}

}
