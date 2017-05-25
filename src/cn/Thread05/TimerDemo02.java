package cn.Thread05;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo02 {
	public static void main(String[] args) {
		Timer t = new Timer();
		t.schedule(new DelTask(t), 3000);
	}
}

class DelTask extends TimerTask {
	private Timer t;

	public DelTask(Timer t) {
		super();
		this.t = t;
	}

	@Override
	public void run() {
		File srcFolder = new File("testFolder");
		delFolder(srcFolder);
		System.out.println("delete success!");
		t.cancel();
	}

	private void delFolder(File srcFolder) {
		File[] files = srcFolder.listFiles();
		for (File f : files) {
			if (f.isFile()) {
				f.delete();
			} else {
				delFolder(f);
			}
		}
		srcFolder.delete();
	}

}