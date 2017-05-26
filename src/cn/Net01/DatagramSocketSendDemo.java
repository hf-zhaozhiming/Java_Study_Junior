package cn.Net01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * udp协议发送数据
 */
public class DatagramSocketSendDemo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// DatagramSocket ds = new DatagramSocket();
		// InetAddress address = InetAddress.getByName("192.168.66.107");
		// byte[] bys = "哈喽，hello，udp send 数据！".getBytes();
		// int length = bys.length;
		// int port = 10086;
		// DatagramPacket dp = new DatagramPacket(bys, length, address, port);
		// ds.send(dp);
		// ds.close();
		DatagramSocket ds = new DatagramSocket();
		byte[] bys = "哈喽，hello，udp send 数据！".getBytes();
		DatagramPacket dp = new DatagramPacket(bys, bys.length,
				InetAddress.getByName("192.168.66.107"), 10086);
		ds.send(dp);
		ds.close();
	}

}
