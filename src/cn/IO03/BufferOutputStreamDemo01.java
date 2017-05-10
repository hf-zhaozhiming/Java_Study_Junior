package cn.IO03;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("haha3.txt"));
		bos.write("buffered output stream demo!".getBytes());
		bos.close();
	}

}
