package cn.set3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetRandomDemo {

	/**
	 * 插入10个不同的1-20的随机数
	 * 
	 * @param args
	 *            1:创建随机对象 2：创建集合 3：插入不同的10个元素
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
