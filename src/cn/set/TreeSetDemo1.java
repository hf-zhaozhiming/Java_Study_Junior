package cn.set;

import java.util.TreeSet;

public class TreeSetDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> ts=new TreeSet<Student>();
		Student s1=new Student("s1",1);
		Student s2=new Student("s2",2);
		Student s3=new Student("s3",3);
		Student s6=new Student("s6",6);
		Student s4=new Student("s4",4);
		Student s5=new Student("s4",4);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		for(Student s:ts)
		{
			System.out.println(s.getName()+"---------"+s.getAge());
		}
	}

}
