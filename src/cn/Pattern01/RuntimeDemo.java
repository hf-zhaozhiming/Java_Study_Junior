package cn.Pattern01;

import java.io.IOException;

public class RuntimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		r.exec("notepad");
	}
}
