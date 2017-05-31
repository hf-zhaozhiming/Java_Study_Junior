package cn.Net02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TcpSend2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket sk = new Socket("192.168.68.230", 2222);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				sk.getOutputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			if (line.equals("886")) {
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		// bw.close();
		// br.close();
		sk.close();

	}

}
