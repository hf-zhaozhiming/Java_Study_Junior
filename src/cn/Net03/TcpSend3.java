package cn.Net03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * ´«ÊäÎÄ¼þ²âÊÔ
 * 
 * @author zhaozm
 * 
 */
public class TcpSend3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("192.168.68.230", 1111);
		BufferedReader br = new BufferedReader(new FileReader("haha.txt"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		s.shutdownOutput();
		BufferedReader bbr = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		String result = bbr.readLine();
		System.out.println(result);
		br.close();
		s.close();
	}
}
