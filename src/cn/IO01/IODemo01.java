package cn.IO01;

import java.io.File;
import java.io.IOException;

public class IODemo01 {
	public static void main(String[] args) {
		File file = new File("d:\\IOTest\\aaa.xxx");
		file.mkdir();
		File file2 = new File("d:\\IOTest\\a.txt");
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
