package cn.IO03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * һ�θ��ƶ���ֽ�
 * 
 * @author zhaozm
 * 
 */
public class FileCopyDemo02 {
	public static void main(String[] args) throws IOException {

		// Date date = new Date();
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// System.out.println("��ʼʱ��:" + sdf.format(date));
		// FileInputStream fis = new FileInputStream("ue.zip");
		// FileOutputStream fos = new FileOutputStream("ue2.zip");
		// byte[] by = new byte[5];
		// int len = 0;
		// while ((len = fis.read(by)) == by.length) {
		// fos.write(by);
		// }
		// fos.write(by, 0, len);
		// fos.close();
		// fis.close();
		// date = new Date();
		// sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// System.out.println("����ʱ��:" + sdf.format(date));

		// �Ż��汾
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("��ʼʱ��:" + sdf.format(date));
		FileInputStream fis = new FileInputStream("ue.txt");
		FileOutputStream fos = new FileOutputStream("ue2.txt");
		// һ��ÿ�ζ�ȡ���Ƕ�ȡ1024 ��1024���������ֽ���
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = fis.read(by)) != -1) {
			fos.write(by, 0, len);
		}
		fos.close();
		fis.close();
		date = new Date();
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("����ʱ��:" + sdf.format(date));

	}
}
