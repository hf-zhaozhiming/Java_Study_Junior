package cn.Thread04;

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
			s.get();
			// TODO Auto-generated method stub
		}
	}

}
