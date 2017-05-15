package cn.IO04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyMultiFolderDemo {
	public static void main(String[] args) throws IOException {
		File srcFolder = new File("D:\\test");
		File destFolder = new File("D:\\copyTest");
		copyFile(srcFolder, destFolder);
	}

	public static void copyFile(File src, File dest) throws IOException {
		File[] files = src.listFiles();
		if (!dest.exists()) {
			dest.mkdir();
		}
		for (File f : files) {
			File newDest = new File(dest, f.getName());
			if (!f.isFile()) {
				File newSrc = new File(src, f.getName());
				copyFile(newSrc, newDest);
			} else {
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream(newDest));
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
}