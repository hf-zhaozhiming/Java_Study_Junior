package cn.Net02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpReceive2 {

	/**
	 * @param args
	 */
	// �������������̨
	// public static void main(String[] args) throws IOException {
	// // TODO Auto-generated method stub
	// ServerSocket ss = new ServerSocket(2222);
	// Socket s = ss.accept();
	// BufferedReader br = new BufferedReader(new InputStreamReader(
	// s.getInputStream()));
	// String line = null;
	// while ((line = br.readLine()) != null) {
	// System.out.println(line);
	// }
	// s.close();
	// }
	// ����������ı��ļ�
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(2222);
		Socket s = ss.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		s.close();
	}
}
