package cn.IO03;

import java.util.Arrays;

public class ChineseStoreDemo {
	public static void main(String[] args) {
		String str = "�Ұ��㣬�й�";
		byte[] by = str.getBytes();
		System.out.println(Arrays.toString(by));
	}
}
