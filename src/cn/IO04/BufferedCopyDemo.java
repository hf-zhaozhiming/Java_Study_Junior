package cn.IO04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCopyDemo {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("haha2.txt"));
		BufferedReader br = new BufferedReader(new FileReader("haha.txt"));
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}
}
