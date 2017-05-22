package cn.Thread01;

public class MyThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		for (int x = 1; x <= 2000; x++)
			System.out.println(getName() + ": " + x);
	}
}
