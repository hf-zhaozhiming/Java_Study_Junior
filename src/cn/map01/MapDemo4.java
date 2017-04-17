package cn.map01;

import java.util.HashMap;
import java.util.Set;

public class MapDemo4 {
	public static void main(String[] args) {
		HashMap<Student, String> hm = new HashMap<Student, String>();
		Student s1 = new Student("草泥马", 11);
		Student s2 = new Student("赵云", 12);
		Student s3 = new Student("李四", 13);
		Student s4 = new Student("王五", 53);
		Student s5 = new Student("草泥马", 11);

		hm.put(s1, "s1");
		hm.put(s2, "s2");
		hm.put(s3, "s3");
		hm.put(s4, "s4");
		hm.put(s5, "s5");

		Set<Student> set = hm.keySet();
		for (Student s : set) {
			String value = hm.get(s);
			System.out.println(s.getName() + "----" + s.getAge() + "----"
					+ value);
		}

	}
}
