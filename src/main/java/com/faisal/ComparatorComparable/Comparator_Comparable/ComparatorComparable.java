package com.faisal.ComparatorComparable.Comparator_Comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Comparator_Comparable {
	private String name;
	private int roll;

	public Comparator_Comparable(String name, int roll) {
		this.name = name;
		this.roll = roll;
		
	}

	// Setter getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setSalry(int roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Comparator_Comparable [name=" + name + ", roll=" + roll + "]";
	}


	
}

class ComparatorExample {
	public static void main(String[] args) {

		List<Comparator_Comparable> listStdnt = getStudents();

		
		System.out.println("Before Sorting : ");
		for (Comparator_Comparable stdnt : listStdnt) {
			System.out.println(stdnt);
		}

		// Sorting by student name
		Collections.sort(listStdnt, new Comparator<Comparator_Comparable>() {
			public int compare(Comparator_Comparable o1, Comparator_Comparable o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		});

		System.out.println("After Sorting by name: ");
		for (Comparator_Comparable stdnt : listStdnt) {
			System.out.println(stdnt);
		}

		System.out.println("Sorting by roll");
		Collections.sort(listStdnt, new Comparator<Comparator_Comparable>() {
			public int compare(Comparator_Comparable o1, Comparator_Comparable o2) {
				return o1.getRoll() - o2.getRoll();
			}
		});
		System.out.println("After sorting by roll: ");
		for (Comparator_Comparable stndt : listStdnt) {
			System.out.println(stndt);
		}

	}

	public static List<Comparator_Comparable> getStudents() {

		List<Comparator_Comparable> stdntList = Arrays.asList(
				new Comparator_Comparable("Faisal Ibn Aziz", 22),
				new Comparator_Comparable("Tamim Iqbal", 24));

		return stdntList;
	}
}