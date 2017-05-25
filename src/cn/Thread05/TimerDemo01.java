package cn.Thread05;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo01 {
	public static void main(String[] args) {
		Timer t = new Timer();
		t.schedule(new MyTask(t), 2000, 1000);
	}
}

class MyTask extends TimerTask {
	private Timer t;

	public MyTask(Timer t) {
		super();
		this.t = t;
	}

	public MyTask() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("定时器中的任务！");
		t.cancel();
	}

}
