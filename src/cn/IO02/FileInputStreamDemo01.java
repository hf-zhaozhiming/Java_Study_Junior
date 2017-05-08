package cn.IO02;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 
 * @author zhaozm 1 创建字节数入流对象 2读取文件并展示在控制台 3释放资源
 */

public class FileInputStreamDemo01 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("haha.txt");

		// int next = fis.read();
		// while (next != -1) {
		// System.out.print((char) (next));
		// next = fis.read();
		// }

		int next = 0;
		while ((next = fis.read()) != -1) {
			System.out.print((char) next);
		}
		fis.close();
	}
}