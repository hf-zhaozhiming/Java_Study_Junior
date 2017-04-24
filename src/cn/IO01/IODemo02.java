package cn.IO01;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IODemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("IOTest\\test.txt");
		System.out.println("absolutePath:" + file.getAbsolutePath());
		System.out.println("lastModifiedDate£º" + file.lastModified());

		Date date = new Date(file.lastModified());
		SimpleDateFormat spf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		String time = spf.format(date);
		System.out.println(time);
	}

}
