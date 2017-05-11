package cn.IO03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream(
				"CopyContrastDemo.java"));
		// 方式1：
		// int by = 0;
		// while ((by = isr.read()) != -1) {
		// System.out.print((char) by);
		// }
		// 方式2
		char[] chs = new char[1024];
		int len = 0;
		while ((len = isr.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}
		isr.close();
	}
}
