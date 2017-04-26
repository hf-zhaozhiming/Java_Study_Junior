package cn.IO01;

import java.io.File;

public class IODemo05 {
	public static void main(String[] args) {
		File file = new File("d:\\360Downloads");
		findJPG(file);
	}

	private static void findJPG(File file) {
		File[] fileArray = file.listFiles();
		for (File f : fileArray) {
			if (!f.isFile()) {
				// System.out.println(f.getAbsolutePath());
				findJPG(f);
			} else if (f.getName().endsWith(".jpg")) {
				System.out.println(f.getAbsolutePath());
			}
		}
	}
}
