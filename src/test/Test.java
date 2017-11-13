package test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("1");
		a.add("2");
		for (String temp : a) {
			if ("1".equals(temp)) {
				a.remove(temp);
			}
			System.out.println(temp);
		}
		System.out.println(a.size());
	}
}
