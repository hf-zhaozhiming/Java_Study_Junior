package cn.IO03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException,
			FileNotFoundException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"haha5.txt"), "UTF-8");
		osw.write("ÎÒ°®ÄãmaÂð");
		osw.close();
	}
}
