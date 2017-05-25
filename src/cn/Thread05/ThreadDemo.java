package cn.Thread05;

/*
 * 匿名线程对象
 */
public class ThreadDemo {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for (int i = 0; i <= 100; i++) {
					System.out.println(Thread.currentThread().getName()
							+ "----" + i);
				}
			};
		}.start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 100; i++) {
					System.out.println(Thread.currentThread().getName()
							+ "----" + i);
				}

			}
		}) {
		}.start();
	}
}
