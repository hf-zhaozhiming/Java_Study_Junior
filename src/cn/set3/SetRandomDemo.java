package cn.set3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetRandomDemo {

	/**
	 * ����10����ͬ��1-20�������
	 * 
	 * @param args
	 *            1:����������� 2���������� 3�����벻ͬ��10��Ԫ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		Set<Integer> set = new HashSet<Integer>();
		while (set.size() < 10) {
			set.add(rd.nextInt(20) + 1);
		}
		for (Integer i : set) {
			System.out.println(i);
		}
	}

}
