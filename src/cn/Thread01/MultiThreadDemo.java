package cn.Thread01;

public class MultiThreadDemo {
	public static void main(String[] args) {
		MyThread my = new MyThread();
		MyThread my1 = new MyThread();
		my.start();
		my1.start();
	}
}
