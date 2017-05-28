package cn.Net02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * udp协议接收数据
 */
public class DatagramReceiveDemo {
	public static void main(String[] args) throws IOException {

		DatagramSocket ds = new DatagramSocket(10086);
		byte[] buf = new byte[1024];
		while (true) {
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
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
		// ds.close();
	}
}
