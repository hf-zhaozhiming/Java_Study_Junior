package cn.Thread02;

public class DieLock extends Thread {
	private boolean flag;

	public DieLock(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (flag) {
			synchronized (MyLock.objA) {
				System.out.println("if ObjA");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (MyLock.objB) {
					System.out.println("if ObjB");
				}
			}
		} else {
			synchronized (MyLock.objB) {
				System.out.println("else ObjB");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (MyLock.objA) {
					System.out.println("else ObjA");
				}
			}
		}
	}
}
