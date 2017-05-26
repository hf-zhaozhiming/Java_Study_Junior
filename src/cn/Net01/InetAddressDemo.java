package cn.Net01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		// 通过主机名获取InetAddress对象 name可以是主机名，也可以是ip地址的字符串表示
		// InetAddress ia = InetAddress.getByName("UHKJMFVGKHGTCVHKL");
		InetAddress ia = InetAddress.getByName("192.168.66.107");
		String hostName = ia.getHostName();
		String hostIp = ia.getHostAddress();
		System.out.println(hostName + "----" + hostIp);
	}
}
