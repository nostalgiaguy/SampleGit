package com.nostalgiaguy.threadconcept;

class MyDaemonThread implements Runnable{

	Thread ther;
	MyDaemonThread(){
		ther=new Thread(this);
		ther.setDaemon(true);
		ther.start();
	}
	
	public boolean isDaemon(){
		return ther.isDaemon();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(true){
				System.out.println("*");
				Thread.sleep(1000);
			}
		}
		catch(Exception e){
			System.out.println("my thread interrupted");
		}
		
	}
	
}
public class DaemonThreadExample {

	public static void main(String[] args) throws InterruptedException {
		MyDaemonThread devil=new MyDaemonThread();
		if(devil.isDaemon()){
			System.out.println("devil thread");
		}
		Thread.sleep(5000);
		System.out.println("main thread ending");
	}
}
