package cn.set;

import java.util.HashSet;
import java.util.Set;

import cn.zhaozm01.Student;

public class SetDemo2 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		Student s1 = new Student("test1", 11);
		Student s2 = new Student("test2", 12);
		Student s3 = new Student("test3", 11);
		Student s4 = new Student("test4", 12);
		Student s5 = new Student("test1", 11);
		Student s6 = new Student("test2", 12);
		set.add(s6);
		set.add(s5);
		set.add(s4);
		set.add(s3);
		set.add(s2);
		set.add(s1);
		for (Student s : set) {
			System.out.println(s.getName() + "----------" + s.getAge());
		}
	}
}
