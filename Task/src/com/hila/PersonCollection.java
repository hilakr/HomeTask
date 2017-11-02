package com.hila;
/*
 * Created on Nov 1, 2017 by Hila 
 * 
 */
import java.util.*;

public class PersonCollection extends Observable {

	private Comparator<Person> personComparator;
	private LinkedList<Person> persons = new LinkedList<Person>();
	
	public PersonCollection(Comparator<Person> newPersonComparator) {
		// PersonCollection constructor gets Comparator<Person> and it saves it the data memeber personComparator
		if (newPersonComparator != null)
			this.personComparator = newPersonComparator;
	}

	public  void  add(Person person) {		
		synchronized (this) {
			try {
				// if queue is empty add person
				if (person != null)
					if (persons.size() == 0)
						persons.add(person);
					else {
						// if "value" of new person is bigger than the maximum value in the queue, we will add new person to the top of the queue
						if (personComparator.compare(person,persons.getFirst()) == 1) {
							persons.add(0,person);
						}
						else {
							// if "value" of new person is lower value than the last person in the queue we will add the new person to be the last element in the queue
							if (personComparator.compare(person, persons.getLast()) == -1) {
								persons.add(persons.size(),person);
							} else {
								// if "value" of new person is lower than the top person and higher from the last person in the queue,
								// we will search the first element with lower "value" than new person.  
								ListIterator<Person> listIterator = persons.listIterator();
								int i = 0;
								while (personComparator.compare(person,listIterator.next()) == -1) {
									i++;
								}
								persons.add(i,person);		
							}				
						}		
					}
				System.out.println("Add to priority queue person number - " + person.getId());
				// update Observer
				// set change
				setChanged();
				// notify observers for change
				notifyObservers("add");
			}// end of try block
			catch (Exception e) {
				System.out.println(e);
			}
		}// end of synchronized block 	
	}// end of method add


	public  void remove() {
		synchronized (this) {
			try {
				persons.remove();
				// set change
				setChanged();
				// notify observers for change
				notifyObservers("remove");
				System.out.println("Remove from queue");
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public void printPersonCollection() {
		System.out.println("People Collection:");
		ListIterator<Person> linkedListIterator = this.persons.listIterator();
		while (linkedListIterator.hasNext()) {
			Person person = linkedListIterator.next();
			System.out.println(person.getFirstName() +"," +person.getId());		
		}
	}
	

}
