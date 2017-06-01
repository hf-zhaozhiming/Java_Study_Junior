package cn.Net02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpReceive4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(1111);
		Socket s = ss.accept();
		BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("2017.jpg"));
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
			bos.flush();
		}

		BufferedOutputStream bbos = new BufferedOutputStream(
				s.getOutputStream());
		bbos.write("照片上传成功".getBytes());
		bbos.flush();

		s.close();
		bos.close();
	}

}
