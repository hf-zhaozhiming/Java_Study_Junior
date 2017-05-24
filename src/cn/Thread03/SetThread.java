package cn.Thread03;

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
			synchronized (s) {
				if (s.getFlag()) {
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (i % 2 == 0) {
					s.setName("zzm");
					s.setAge(20);
					s.setFlag(true);
				} else {
					s.setName("mmm");
					s.setAge(200);
					s.setFlag(true);
				}
				i++;
				s.setFlag(true);
				s.notify();
			}

		}
	}

}
