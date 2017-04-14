package cn.map01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
	public static void main(String[] args) {
		Map m = new HashMap<String, String>();
		m.put("文章", "马伊琍");
		m.put("岳云鹏", "路人甲");
		m.put("沙溢", "路人乙");
		m.put("黄渤", "路人丙");
		m.put("陈羽凡", "路人丁");
		System.out.println("map:" + m);
	}

}
