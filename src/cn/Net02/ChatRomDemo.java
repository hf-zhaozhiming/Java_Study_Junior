package cn.Net02;

public class ChatRomDemo {

	/**
	 * @param args
	 *            ���ö��̣߳������ͷ��ͽ��շ�չ����һ�������ڲ�
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
