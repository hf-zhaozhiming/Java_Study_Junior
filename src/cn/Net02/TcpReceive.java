package cn.Net02;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpReceive {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(2222);
		Socket s = ss.accept();
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip + "---" + new String(bys, 0, len));
		s.close();
	}

}
