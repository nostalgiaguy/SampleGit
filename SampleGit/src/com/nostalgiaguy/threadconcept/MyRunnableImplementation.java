package com.nostalgiaguy.threadconcept;

public class MyRunnableImplementation implements Runnable{
	

	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("hell "+Thread.currentThread().getName()+"          "+System.currentTimeMillis());
			System.out.println("runs with " + i+"          "+System.currentTimeMillis());
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
			System.out.println("hello "+Thread.currentThread().getName());
			System.out.println("runs with " + i);
		}
		}},"pathak");
		
		t2.start();
		
	}
	
	
}