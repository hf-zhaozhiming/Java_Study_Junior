package cn.IO01;

import java.io.File;
import java.io.FilenameFilter;

public class IODemo04 {
	public static void main(String[] args) {
		File file = new File("d:\\");
		// 得先判定是否是文件，文件夹也有可能是xxx.jpg
		File[] fileArray = file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return new File(dir, name).isFile() && name.endsWith(".jpg");
			}
		});
		for (File f : fileArray) {
			System.out.println(f);
		}
	}
}
