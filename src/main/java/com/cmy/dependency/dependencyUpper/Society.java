package com.cmy.dependency.dependencyUpper;

import java.util.ArrayList;
import com.cmy.dependency.dependencymiddle.Family;

public class Society {
	private ArrayList<Family> familyList;
	private String name;
	private int size;
	private Family richfam;
	public Society(ArrayList<Family> familyList, String name) {
		this.familyList = familyList;
		this.name = name;
		
		familyList = new ArrayList<Family>();
		size = 0;
	}
	public ArrayList<Family> getFamilyList() {
		return familyList;
	}
	public void addFamily(Family family) {
		familyList.add(family);
		size++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}
	
	@Override
	public String toString() {
		return "Society [familyList=" + familyList + ", name=" + name + ", size=" + size + "Richest = "+ richfam.getSurname()+"]";
	}
}
