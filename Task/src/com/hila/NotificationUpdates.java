package com.hila;
import java.util.Observable;
import java.util.Observer;

public class NotificationUpdates implements Observer  {

	@Override
	public void update(Observable o, Object arg) {
		// publishes a notification to subscriber objects upon any Add/Remove.
		System.out.println("notify for action : " + (String)arg);
		
	}

}
