package cn.Thread04;

/*
 * 生产者消费者模式测试
 */
public class ThreadDemo {
	public static void main(String[] args) {
		Student s = new Student();
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);
		Thread t1 = new Thread(gt);
		Thread t2 = new Thread(st);
		// t1.setPriority(10);
		t1.start();
		t2.start();
	}
}
