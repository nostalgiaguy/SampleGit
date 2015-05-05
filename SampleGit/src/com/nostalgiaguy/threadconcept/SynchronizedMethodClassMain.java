package com.nostalgiaguy.threadconcept;

import java.util.ArrayList;

class SynchronizedMethodClass {

	private ArrayList<Integer> nums1;
	private String pos1;

    public SynchronizedMethodClass() {
    	nums1 = new ArrayList<Integer>();
    	nums1.add(0);
    	pos1 = "0";
    }

	public ArrayList<Integer> getNums1() {
		return nums1;
	}

	public void setNums1(ArrayList<Integer> nums1) {
		this.nums1 = nums1;
	}

	public String getPos1() {
		return pos1;
	}

	public void setPos1(String pos1) {
		this.pos1 = pos1;
	}

	public synchronized void syncMethod(String threadName) {
    	Integer number = nums1.get(nums1.size() - 1) + 1;
        pos1 = String.valueOf(number);
        nums1.add(number);
        System.out.println("Thread " + threadName + " : " + nums1.get(nums1.size() - 1) + " - " + pos1);
    }

/*	// public void syncBlock(String threadName) {
	public void syncMethod(String threadName) {
	    	counter++;
	    	System.out.println("Thread " + threadName + " - counter: " + counter);
	        synchronized (this) {
	        	Integer number = nums1.get(nums1.size() - 1) + 1;
	            pos1 = String.valueOf(number);
	        	nums1.add(number);
	            System.out.println("Thread " + threadName + " Added to list: " 
	            		+ nums1.get(nums1.size() - 1) + " - " + pos1);
	           }
	    }*/
}

class SyncMethodRunnable implements Runnable {

	private SynchronizedMethodClass synchronizedMethodClass;
	
	private String threadName;
	
	public SyncMethodRunnable(SynchronizedMethodClass synchronizedMethodClass, String threadName) {
		this.synchronizedMethodClass = synchronizedMethodClass;
		this.threadName = threadName;
	}
	
	public void run() {   
        for (int i = 0; i < 5; i++) {
        	synchronizedMethodClass.syncMethod(threadName);
        }
    }

}

public class SynchronizedMethodClassMain{

	public static void main(String[] args) throws InterruptedException {
		SynchronizedMethodClass e1=new SynchronizedMethodClass();
		System.out.println("*************************synchronized method example**********************");
		Thread t1=new Thread(new SyncMethodRunnable(e1,"shubham"));
		Thread t2=new Thread(new SyncMethodRunnable(e1,"pathak"));
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(e1.getNums1());
		System.out.println(e1.getPos1());
	}
}
