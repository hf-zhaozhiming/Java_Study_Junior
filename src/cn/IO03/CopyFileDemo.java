package cn.IO03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用字节流复制中文字符也没有任何问题！！！
 * 
 * 效率较低，因为一次读取一个字节，复制大文件时速度很慢！！！！！
 * 
 * @author zhaozm
 * 
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("haha.txt");
		FileOutputStream fos = new FileOutputStream("haha2.txt");
		int read = 0;
		while ((read = fis.read()) != -1) {
			fos.write(read);
		}
		fis.close();
		fos.close();
	}
}
