package cn.IO03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 基本字节流 单字节读写 共耗时：17592毫秒
 * 基本字节流 按数组读写共耗时：27毫秒
 * 缓冲字节流 单字节读写共耗时：217毫秒
 * 缓冲字节流 按数组读写共耗时：11毫秒
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
		System.out.println("共耗时：" + (end - start) + "毫秒");
	}

	// 基本字节流 单字节读写
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

	// 基本字节流 按数组读写
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

	// 缓冲字节流 单字节读写
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

	// 缓冲字节流 按数组读写
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
