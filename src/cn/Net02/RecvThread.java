package cn.Net02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class RecvThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		DatagramSocket ds;
		try {
			ds = new DatagramSocket(10086);
			System.out.println("recv");
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			while (true) {
				// DatagramPacket dp = new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				byte[] recv = dp.getData();
				String content = new String(recv, 0, dp.getLength());
				if (content.equals("886")) {
					System.out.println("886");
					break;
				}
				System.out.println(dp.getAddress().getHostAddress() + "发来数据："
						+ content);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
