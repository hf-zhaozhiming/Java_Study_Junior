package cn.map03;

import java.util.Comparator;
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
		TreeMap<Student, String> hm = new TreeMap<Student, String>(
				new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {

						int num1 = o1.getAge() - o2.getAge();
						int num2 = num1 == 0 ? o1.getName().compareTo(
								o2.getName()) : num1;
						return num2;
					}

				});
		Student s1 = new Student("草泥马", 11);
		Student s2 = new Student("赵云", 11);
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
