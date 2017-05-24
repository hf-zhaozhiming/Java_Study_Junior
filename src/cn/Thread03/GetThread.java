package cn.Thread03;

public class GetThread implements Runnable {
	private Student s;

	public GetThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GetThread(Student s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if (!s.getFlag()) {
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(s.getName() + "----" + s.getAge());
				s.setFlag(false);
				s.notify();
			}
			// TODO Auto-generated method stub
		}
	}

}
