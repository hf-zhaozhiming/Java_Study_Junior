package cn.Net03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UserThread implements Runnable {
	private Socket s;

	public UserThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			String fileName = System.currentTimeMillis() + ".txt";
			// BufferedWriter bw = new BufferedWriter(new FileWriter(
			// "copyHaha.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
			String line = null;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
				bw.flush();
			}

			BufferedWriter bbw = new BufferedWriter(new OutputStreamWriter(
					s.getOutputStream()));
			bbw.write("文件上传成功！");
			bbw.newLine();
			bbw.flush();
			bw.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
