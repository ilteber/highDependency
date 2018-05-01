package com.cmy.dependency.dependencyUpper;

import com.cmy.dependency.dependencylower.Person;
import com.cmy.dependency.dependencymiddle.Family;

public class UpDriver {
	public static void main(String[] args) {
		Person p1 = new Person(24, "Ali", "Yilmaz", false);
		Person p2 = new Person(25, "Fatma", "Yilmaz", false);
		Person p3 = new Person(30, "Ilteber", "Yilmaz", true);
		Family family = new Family(p1, p2, "Yilmaz");
		family.addChildren(p3);
		System.out.println(family.showParent());
	}
}
