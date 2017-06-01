package cn.Net02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpSend4 {

	/**
	 * 传输图片测试 使用字节流
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("192.168.68.230", 1111);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"2016.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
			bos.flush();
		}
		s.shutdownOutput();

		BufferedInputStream bbis = new BufferedInputStream(s.getInputStream());
		byte[] result = new byte[1024];
		int len2 = bbis.read(result);
		System.out.println(new String(result, 0, len2));

		bis.close();
		s.close();
	}

}
