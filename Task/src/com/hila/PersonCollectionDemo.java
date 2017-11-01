package com.hila;

import java.util.Date;

public class PersonCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("hello");
		  MyPerson person1 = new MyPerson(1,"hila",new Date(22/10/1990));
		  MyPerson person2 = new MyPerson(2,"yossi",new Date(22/10/2000));
		  MyPerson person3 = new MyPerson(3,"shiran",new Date(22/10/2005));
		  MyPerson person4 = new MyPerson(4, "dalia",new Date(22/10/2017));
		  
		  NotificationUpdates noti = new NotificationUpdates();
		  PersonCollection mypersons = new PersonCollection(new SecretCompare()) ;
		  mypersons.addObserver(noti);
		  class MyThread1 extends Thread{  
			  PersonCollection t;  
			  MyThread1(PersonCollection t){  
			  this.t=t;  
			  }  
			  public void run(){  
			  t.add( new MyPerson(4,"hila",new Date(22/10/1990)));
			  t.add( new MyPerson(3,"hila",new Date(22/10/1990)));
			  t.add( new MyPerson(3,"hila",new Date(22/10/1990)));
			  t.remove();
			  t.remove();
			  t.remove();
			  t.remove();
			  t.remove();
			  }  
			    
			  }  
			  class MyThread2 extends Thread{  
			  PersonCollection t;  
			  MyThread2(PersonCollection t){  
			  this.t=t;  
			  }  
			  public void run(){  
				  t.add( new MyPerson(1,"hila",new Date(22/10/1990)));
				  t.add( new MyPerson(2,"hila",new Date(22/10/1990)));
//				  t.add( new MyPerson(3,"hila",new Date(22/10/1990)));
//				  t.add( new MyPerson(4,"hila",new Date(22/10/1990)));
//				  t.add( new MyPerson(5,"hila",new Date(22/10/1990)));
//				  t.add( new MyPerson(6,"hila",new Date(22/10/1990)));
//				  t.add( new MyPerson(7,"hila",new Date(22/10/1990)));
//				  t.add( new MyPerson(8,"hila",new Date(22/10/1990)));
				  t.remove();			  }  
			  }  		  
		  
		  Thread t1 = new MyThread1(mypersons);
		  Thread t2 = new MyThread2(mypersons);
		  t1.start();
		  t2.start();

			for (int i = 0; i < 10; i++)
			{
				System.out.println(Thread.currentThread().getName());
				mypersons.printPersonCollection();
				        
				try
				{
					Thread.sleep(1000);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}

		}
}
