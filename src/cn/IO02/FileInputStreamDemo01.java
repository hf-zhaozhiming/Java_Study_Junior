package cn.IO02;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 
 * @author zhaozm 1 �����ֽ����������� 2��ȡ�ļ���չʾ�ڿ���̨ 3�ͷ���Դ
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