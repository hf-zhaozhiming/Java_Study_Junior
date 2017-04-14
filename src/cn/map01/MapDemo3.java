package cn.map01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {

	/**
	 * map遍历方法2 每次获取一个键值对
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> m = new HashMap<String, String>();
		m.put("文章", "马伊琍");
		m.put("岳云鹏", "路人甲");
		m.put("沙溢", "路人乙");
		m.put("黄渤", "路人丙");
		m.put("陈羽凡", "路人丁");
		Set<Map.Entry<String, String>> set = m.entrySet();
		for (Map.Entry<String, String> map : set) {
			String key = map.getKey();
			String value = map.getValue();
			System.out.println(key + "------" + value);
		}
	}

}
