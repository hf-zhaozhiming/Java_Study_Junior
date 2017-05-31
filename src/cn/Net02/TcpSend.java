package cn.Net02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
 * tcp
 */
public class TcpSend {
	public static void main(String[] args) throws IOException {
		Socket sk = new Socket("192.168.68.230", 2222);
		OutputStream os = sk.getOutputStream();
		os.write("hello,tcp Œ“1111¿¥¡À£°".getBytes());
		os.close();
	}
}
