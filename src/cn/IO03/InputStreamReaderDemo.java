package cn.IO03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream(
				"haha5.txt"), "UTF-8");
		int by = 0;
		int count = 0;
		while ((by = isr.read()) != -1) {
			System.out.print((char) by);
			count++;
		}
		System.out.println(count);
		isr.close();
	}
}
