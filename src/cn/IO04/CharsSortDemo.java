package cn.IO04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CharsSortDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("haha.txt"));
		String line = br.readLine();
		br.close();
		char[] chs = line.toCharArray();
		Arrays.sort(chs);
		for (char c : chs) {
			System.out.print(c);
		}

	}
}
