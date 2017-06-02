package cn.Reflect02;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * 使用配置文件加反射技术，实现动态配置功能
 */
public class TestDemo {

	public static void main(String[] args) throws Exception {
		// 代码后期改动太大，使用配置文件加反射技术，实现动态配置功能
		// Student s = new Student();
		// s.love();
		//
		// Teacher t = new Teacher();
		// t.love();
		//
		// Worker w = new Worker();
		// w.love();

		Properties p = new Properties();
		FileReader fr = new FileReader("reflect.txt");
		p.load(fr);
		String className = p.getProperty("className");
		String methodName = p.getProperty("methodName");

		Class c = Class.forName(className);
		Constructor con = c.getDeclaredConstructor();
		Object obj = con.newInstance();
		Method m = c.getDeclaredMethod(methodName);
		m.invoke(obj);
	}

}
