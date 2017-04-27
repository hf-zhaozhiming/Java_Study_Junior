package cn.IO01;

import java.util.Scanner;

/**
 * 计算阶乘
 * 
 * @author zhaozm
 * 
 */
public class IODemo06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("要计算几的阶乘？请输入数字：");
		int number = sc.nextInt();
		System.out.println(calculate(number));
	}

	private static int calculate(int number) {
		// TODO Auto-generated method stub
		if (number >= 2) {
			return number * calculate(number - 1);
		} else
			return 1;
	}
}
