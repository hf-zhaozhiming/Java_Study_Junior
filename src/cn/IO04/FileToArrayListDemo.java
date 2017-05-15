package cn.IO04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArrayListDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("arraylist.txt"));
		ArrayList<String> arr = new ArrayList<String>();
		String line = null;
		while ((line = br.readLine()) != null) {
			arr.add(line);
		}

		for (String ele : arr) {
			System.out.println(ele);
		}
	}
}
