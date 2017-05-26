package cn.Net01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * udp协议接收数据
 */
public class DatagramReceiveDemo {
	public static void main(String[] args) throws IOException {
		// DatagramSocket ds = new DatagramSocket(10086);
		// byte[] buf = new byte[1024];
		// int length = buf.length;
		// DatagramPacket dp = new DatagramPacket(buf, length);
		// ds.receive(dp);
		// byte[] recv = dp.getData();
		// int recvLength = dp.getLength();
		// InetAddress ia = dp.getAddress();
		// String hostName = ia.getHostName();
		// String hostIp = ia.getHostAddress();
		// String content = new String(recv, 0, recvLength);
		// System.out.println(hostIp + "发来数据：" + content);
		// ds.close();
		DatagramSocket ds = new DatagramSocket(10086);
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		ds.receive(dp);
		byte[] recv = dp.getData();
		String content = new String(recv, 0, dp.getLength());
		System.out
				.println(dp.getAddress().getHostAddress() + "发来数据：" + content);
		ds.close();
	}
}
