package cn.IO03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ֽ������������ַ�Ҳû���κ����⣡����
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
