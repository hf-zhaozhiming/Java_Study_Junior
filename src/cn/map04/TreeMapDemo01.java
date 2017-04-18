package cn.map04;

import java.util.Set;
import java.util.TreeMap;

/**
 * 使用比较器排序
 * 
 * @author zhaozm
 * 
 */

public class TreeMapDemo01 {
	public static void main(String[] args) {
		TreeMap<Student, String> hm = new TreeMap<Student, String>();
		Student s1 = new Student("草泥马", 11);
		Student s2 = new Student("赵云", 11);
		Student s6 = new Student("赵云", 11);
		Student s3 = new Student("李四", 13);
		Student s4 = new Student("王五", 53);
		Student s5 = new Student("草泥马", 11);

		hm.put(s1, "s1");
		hm.put(s2, "s2");
		hm.put(s3, "s3");
		hm.put(s4, "s4");
		hm.put(s5, "s5");
		hm.put(s6, "s5");

		Set<Student> set = hm.keySet();
		for (Student s : set) {
			String value = hm.get(s);
			System.out.println(s.getName() + "----" + s.getAge() + "----"
					+ value);
		}

	}
}
