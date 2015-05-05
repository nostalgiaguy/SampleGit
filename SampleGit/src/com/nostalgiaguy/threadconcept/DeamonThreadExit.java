package com.nostalgiaguy.threadconcept;


class MyDeamonThread extends Thread{
	MyDeamonThread(){
		
	}
	
	public void run(){
		boolean isDeamon=isDaemon();
		System.out.println("isDeamon :" + isDeamon);
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex){
			
		}
	}
}
public class DeamonThreadExit {

	public static void main(String[] args) {
		Thread t=new MyDeamonThread();
		t.setDaemon(true);
		t.start();
	}
}
