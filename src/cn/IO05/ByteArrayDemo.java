package cn.IO05;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayDemo {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		for (int i = 0; i < 10; i++) {
			baos.write(("hello" + i).getBytes());
		}
		byte[] bys = baos.toByteArray();

		ByteArrayInputStream bais = new ByteArrayInputStream(bys);
		int by = 0;
		while ((by = bais.read()) != -1) {
			System.out.print((char) by);
		}
	}
}
