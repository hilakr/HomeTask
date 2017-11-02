package com.hila;

import java.util.Date;

public class PersonCollectionDemo {

	public static void main(String[] args) {
		MyPerson person1 = new MyPerson(1,"hila",new Date(22/10/1990));
		MyPerson person2 = new MyPerson(2,"yossi",new Date(22/10/2000));
		MyPerson person3 = new MyPerson(3,"shiran",new Date(22/10/2005));
		MyPerson person4 = new MyPerson(4, "dalia",new Date(22/10/2017));

		NotificationUpdates noti = new NotificationUpdates();
		PersonCollection mypersons = new PersonCollection(new SecretCompare()) ;
		mypersons.addObserver(noti);
		
		mypersons.add(person1);
		mypersons.add(person2);
		mypersons.add(person3);
		mypersons.add(person4);
		mypersons.add(person1);
		mypersons.printPersonCollection();
		mypersons.remove();
		mypersons.printPersonCollection();

		

	}
}
