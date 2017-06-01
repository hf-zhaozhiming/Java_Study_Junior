package cn.Net03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpReceive3 {

	/**
	 * @param args
	 *            使用多线程实现多客户端同时上传文件到服务器
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(1111);
		while (true) {
			Socket s = ss.accept();
			new Thread(new UserThread(s)).start();
		}

	}

}
