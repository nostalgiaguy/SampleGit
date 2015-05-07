package com.nostalgiaguy.threadconcept;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyRunnableImplementation implements Runnable{
	

	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("hell "+Thread.currentThread().getName()+"          "+new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
			System.out.println("runs with " + i+"          "+new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
		}
	}



	public static void main(String args[]){

		MyRunnableImplementation m=new MyRunnableImplementation();
		//Thread t1=new Thread(new MyRunnableImplementation(),"shubham");
		Thread t1=new Thread(m,"shubham");
		t1.start();
		
		Thread t3=new Thread(m,"romy");
		t3.start();
		
		Thread t2=new Thread(new Runnable(){ public void run(){
			for(int i=0;i<5;i++){
			System.out.println("hello "+Thread.currentThread().getName()+"            "+new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
			System.out.println("runs with " + i+"          "+new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
		}
		}},"pathak");
		
		t2.start();
		
	}
	
	
}