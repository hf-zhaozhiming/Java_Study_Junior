package cn.Thread01;

public class SellTicket implements Runnable {
	private int num = 400;
	private Object obj = new Object();

	public void run() {
		// TODO Auto-generated method stub

		while (num > 0) {
			synchronized (obj) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("窗口" + Thread.currentThread().getName()
						+ "正在出售第" + (num--) + "张票");
			}
		}
	}

}
