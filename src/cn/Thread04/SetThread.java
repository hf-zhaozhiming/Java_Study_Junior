package cn.Thread04;

public class SetThread implements Runnable {
	private Student s;
	private int i = 0;

	public SetThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SetThread(Student s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (true) {
			if (i % 2 == 0) {
				s.set("zhangsan", 12);
			} else {
				s.set("lisi", 111);
			}
			i++;
		}
	}

}
