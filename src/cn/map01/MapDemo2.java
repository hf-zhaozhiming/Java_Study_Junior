package cn.map01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	/**
	 * map ��������1 �Ȼ�ȡ�����ٻ�ȡ����Ӧ��ֵ
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> m = new HashMap<String, String>();
		m.put("����", "�����P");
		m.put("������", "·�˼�");
		m.put("ɳ��", "·����");
		m.put("�Ʋ�", "·�˱�");
		m.put("����", "·�˶�");

		Set<String> set = m.keySet();
		for (String s : set) {
			String value = m.get(s);
			System.out.println(s + "--------" + value);
		}
	}

}
