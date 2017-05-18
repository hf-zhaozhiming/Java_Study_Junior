package cn.IO06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 序列化和反序列化
 */
public class ObjectStreamDemo {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		// write();
		read();
	}

	private static void read() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"xuliehua.txt"));
		Object ob = ois.readObject();
		ois.close();
		System.out.println(ob);
	}

	private static void write() throws IOException {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"xuliehua.txt"));
		Student s = new Student("zhaozm", 10);
		oos.writeObject(s);
		oos.close();
	}
}
