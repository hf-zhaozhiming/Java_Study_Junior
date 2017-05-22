package cn.Thread01;

public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket st = new SellTicket();
		Thread t1 = new Thread(st, "´°¿Ú1");
		Thread t2 = new Thread(st, "´°¿Ú2");
		Thread t3 = new Thread(st, "´°¿Ú3");

		t2.start();
		t1.start();
		t3.start();
	}
}
