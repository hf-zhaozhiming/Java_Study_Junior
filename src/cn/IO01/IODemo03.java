package cn.IO01;

import java.io.File;

public class IODemo03 {
	public static void main(String[] args) {
		File file = new File("d:\\");
		// �����ж��Ƿ����ļ����ļ���Ҳ�п�����xxx.jpg
		/*
		 * String[] fileArray = file.list(); for (String name : fileArray) { if
		 * (name.endsWith(".jpg")) { System.out.println(name); return; } }
		 * System.out.println("������jpg�ļ���");
		 */

		File[] fileArray = file.listFiles();
		for (File f : fileArray) {
			if (f.isFile()) {
				if (f.getName().endsWith(".jpg"))
					System.out.println(f.getName());
			}
		}
	}
}
