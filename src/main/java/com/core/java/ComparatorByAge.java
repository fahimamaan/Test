package com.core.java;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Comparable1>{

	@Override
	public int compare(Comparable1 o1, Comparable1 o2) {
		return o1.getAge()-o2.getAge();
	}

}
