package cn.Net02;

public class ChatRomDemo {

	/**
	 * @param args
	 *            利用多线程，将发送方和接收方展现在一个窗口内部
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SendThread st = new SendThread();
		RecvThread rt = new RecvThread();
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(rt);
		t1.start();
		t2.start();
	}

}
