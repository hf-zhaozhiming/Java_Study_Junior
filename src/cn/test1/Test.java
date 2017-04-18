package cn.test1;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * 统计字符串中字符出现的次数
 * 
 * @author zhaozm
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] in = input.toCharArray();

		TreeMap<Character, Integer> hm = new TreeMap<Character, Integer>();
		for (int i = 0; i < in.length; i++) {
			if (hm.containsKey(in[i])) {
				int value = hm.get(in[i]);
				hm.put(in[i], ++value);
			} else {
				hm.put(in[i], 1);
			}
		}
		StringBuilder sb = new StringBuilder();
		Set<Map.Entry<Character, Integer>> set = hm.entrySet();

		for (Map.Entry<Character, Integer> entry : set) {
			sb.append(entry.getKey());
			sb.append("(");
			sb.append(entry.getValue());
			sb.append(")");
		}
		System.out.println(sb.toString());
	}
}
