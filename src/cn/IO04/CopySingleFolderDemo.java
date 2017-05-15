package cn.IO04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 1:遍历该文件夹，获取每一个文件
 * 2：复制每个文件到指定目标目录
 */
public class CopySingleFolderDemo {
	public static void main(String[] args) throws IOException {
		File srcFolder = new File("D:\\test");
		File destFolder = new File("D:\\test1");
		File[] files = srcFolder.listFiles();

		for (File f : files) {
			File newFile = new File(destFolder, f.getName());
			if (!destFolder.exists()) {
				destFolder.mkdir();
			}
			BufferedOutputStream bos = new BufferedOutputStream(
					new FileOutputStream(newFile));
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream(f));
			byte[] bys = new byte[1024];
			int len = 0;
			while ((len = bis.read(bys)) != -1) {
				bos.write(bys, 0, len);
			}
			bos.close();
			bis.close();
		}
	}
}
