package cn.map01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {

	/**
	 * map��������2 ÿ�λ�ȡһ����ֵ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> m = new HashMap<String, String>();
		m.put("����", "�����P");
		m.put("������", "·�˼�");
		m.put("ɳ��", "·����");
		m.put("�Ʋ�", "·�˱�");
		m.put("����", "·�˶�");
		Set<Map.Entry<String, String>> set = m.entrySet();
		for (Map.Entry<String, String> map : set) {
			String key = map.getKey();
			String value = map.getValue();
			System.out.println(key + "------" + value);
		}
	}

}
