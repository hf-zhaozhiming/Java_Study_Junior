package cn.Reflect01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo02 {
	public static void main(String[] args) throws Exception {

		Class c = Class.forName("cn.Reflect01.Student");
		Field[] fields = c.getDeclaredFields();
		for (Field f : fields) {
			System.out.println(f);
		}

		// public 成员变量
		Field addField = c.getField("addr");
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		addField.set(obj, "adadsfad");
		System.out.println(obj);

		// private成员变量
		Field nameField = c.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(obj, "test");
		System.out.println(obj);
	}
}
