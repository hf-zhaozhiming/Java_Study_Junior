package cn.set4;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] s = new Student[5];
		TreeSet<Student> ts = new TreeSet<Student>();
		int count = 0;
		while (count < 5) {
			// Scanner sc = new Scanner(System.in);
			s[count] = new Student();
			System.out.print("������ѧ��������");
			s[count].setName(sc.nextLine());
			System.out.print("�������ĳɼ���");
			s[count].setChinaese(Integer.parseInt(sc.nextLine()));
			System.out.print("����Ӣ��ɼ���");
			s[count].setEnglish(Integer.parseInt(sc.nextLine()));
			System.out.print("������ѧ�ɼ���");
			s[count].setMath(Integer.parseInt(sc.nextLine()));
			ts.add(s[count]);
			count++;
		}
		for (Student x : ts) {
			System.out.println(x.getName() + "--"
					+ x.sum(x.getChinaese(), x.getEnglish(), x.getMath()));
		}

	}
}
