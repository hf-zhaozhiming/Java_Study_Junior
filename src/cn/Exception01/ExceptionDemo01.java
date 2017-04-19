package cn.Exception01;

public class ExceptionDemo01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		System.out.println("over!!!");
	}
}
