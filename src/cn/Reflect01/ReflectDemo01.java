package cn.Reflect01;

import java.lang.reflect.Constructor;

/*
 * 通过反射访问构造方法
 */
public class ReflectDemo01 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.Reflect01.Student");
		Constructor[] cons = c.getConstructors();
		for (Constructor con : cons) {
			System.out.println(con);
		}

		Constructor[] cons2 = c.getDeclaredConstructors();
		for (Constructor con2 : cons2) {
			System.out.println(con2);
		}
		// 无参构造
		// Constructor con = c.getConstructor();
		// Object obj = con.newInstance(null);
		// System.out.println(obj);

		// 带参构造
		// Constructor con = c.getConstructor(String.class, int.class,
		// String.class);
		// Object obj = con.newInstance("aa", 2, "d");
		// System.out.println(obj);

		// 方位私有构造
		Constructor con = c.getDeclaredConstructor(String.class);
		con.setAccessible(true);
		Object obj = con.newInstance("aa");
		System.out.println(obj);
	}
}
