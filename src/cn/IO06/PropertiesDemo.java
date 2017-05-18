package cn.IO06;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) {
		Properties p = new Properties();
		p.put(1, "hello");
		p.put(2, "world");
		p.put(3, "java");
		System.out.println("properties:" + p);

		// ×Ô¼º±éÀú

		Set<Object> s = p.keySet();
		for (Object o : s) {
			Object value = p.get(o);
			System.out.println(o + "--" + value);
		}
	}
}
