package com.hila;
import java.util.Comparator;

public class SecretCompare implements Comparator<Person>{
	///

	@Override
	public int compare(Person o1, Person o2) {
		// There may be many possible "algorithms" to determine what does it mean that a person has the maximum value and it possible to implement it in that method,
		// I choose for the example that the person with the maximum value is the person with the highest id.
		return Integer.compare(o1.getId(), o2.getId());
	}
	

}
