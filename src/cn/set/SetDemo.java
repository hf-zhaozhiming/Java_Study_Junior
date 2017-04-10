package cn.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * set ÔªËØÎ¨Ò» ÎÞÐò
 * 
 * @author zhaozm
 * 
 */
public class SetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("are");
		set.add("you");
		set.add("hello");
		set.add("old");

		/*
		 * for (String s : set) { System.out.println(s); }
		 */
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			String s = (String) i.next();
			System.out.println(s);
		}
	}
}
