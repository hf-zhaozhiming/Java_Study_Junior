package cn.IO02;

import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo01 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fos = new FileOutputStream("haha.txt");
		byte[] b = "hello,io".getBytes();
		fos.write(b);
		fos.write("asdfasdfasdfa".getBytes());
		fos.write("97".getBytes());
		fos.close();

		// byte[] b = "hello,io".getBytes();
		// System.out.println(b);

	}
}
