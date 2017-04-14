package cn.map01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	/**
	 * map 遍历方法1 先获取键，再获取键对应的值
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> m = new HashMap<String, String>();
		m.put("文章", "马伊琍");
		m.put("岳云鹏", "路人甲");
		m.put("沙溢", "路人乙");
		m.put("黄渤", "路人丙");
		m.put("陈羽凡", "路人丁");

		Set<String> set = m.keySet();
		for (String s : set) {
			String value = m.get(s);
			System.out.println(s + "--------" + value);
		}
	}

}
