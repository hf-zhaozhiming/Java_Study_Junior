package cn.Net01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		// ͨ����������ȡInetAddress���� name��������������Ҳ������ip��ַ���ַ�����ʾ
		// InetAddress ia = InetAddress.getByName("UHKJMFVGKHGTCVHKL");
		InetAddress ia = InetAddress.getByName("192.168.66.107");
		String hostName = ia.getHostName();
		String hostIp = ia.getHostAddress();
		System.out.println(hostName + "----" + hostIp);
	}
}
