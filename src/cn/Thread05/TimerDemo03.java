package cn.Thread05;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo03 {
	public static void main(String[] args) throws ParseException {
		Timer t = new Timer();
		String time = "2017-05-25 10:46:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(time);
		t.schedule(new DelTask1(t), d);
	}
}

class DelTask1 extends TimerTask {
	private Timer t;

	public DelTask1(Timer t) {
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