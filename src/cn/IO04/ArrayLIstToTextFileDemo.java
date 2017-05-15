package cn.IO04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIstToTextFileDemo {
	public static void main(String[] args) throws IOException {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("hello");
		arraylist.add("world");
		arraylist.add("java");
		// BufferedWriter bw = new BufferedWriter(new
		// FileWriter("arraylist.txt"));
		// for (String ele : arraylist) {
		// bw.write(ele);
		// bw.newLine();
		// bw.flush();
		// }
		// bw.close();

		BufferedWriter bw = new BufferedWriter(new FileWriter("arraylist.txt"));
		Iterator<String> iter = arraylist.iterator();
		while (iter.hasNext()) {
			bw.write(iter.next());
			bw.newLine();
			bw.flush();
		}
		bw.close();

	}
}
