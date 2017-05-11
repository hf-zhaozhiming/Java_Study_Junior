package cn.IO03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �����ֽ��� ���ֽڶ�д ����ʱ��17592����
 * �����ֽ��� �������д����ʱ��27����
 * �����ֽ��� ���ֽڶ�д����ʱ��217����
 * �����ֽ��� �������д����ʱ��11����
 */
public class CopyContrastDemo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		// method1("haha4.txt", "haha5.txt");
		// method2("haha4.txt", "haha5.txt");
		// method3("haha4.txt", "haha5.txt");
		method4("haha4.txt", "haha5.txt");
		long end = System.currentTimeMillis();
		System.out.println("����ʱ��" + (end - start) + "����");
	}

	// �����ֽ��� ���ֽڶ�д
	private static void method1(String src, String dest) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}
		fos.close();
		fis.close();
	}

	// �����ֽ��� �������д
	private static void method2(String src, String dest) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		int len = 0;
		byte[] bys = new byte[1024];
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}
		fos.close();
		fis.close();
	}

	// �����ֽ��� ���ֽڶ�д
	private static void method3(String src, String dest) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				src));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(dest));
		int by = 0;
		while ((by = bis.read()) != -1) {
			bos.write(by);
		}
		bos.close();
		bis.close();
	}

	// �����ֽ��� �������д
	private static void method4(String src, String dest) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				src));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(dest));
		int len = 0;
		byte[] bys = new byte[1024];
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}
		bos.close();
		bis.close();
	}

}
