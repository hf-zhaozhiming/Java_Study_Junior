package cn.Thread02;

public class DieLockDemo {
	public static void main(String[] args) {
		DieLock d1 = new DieLock(true);
		DieLock d2 = new DieLock(false);
		d1.start();
		d2.start();
	}
}
