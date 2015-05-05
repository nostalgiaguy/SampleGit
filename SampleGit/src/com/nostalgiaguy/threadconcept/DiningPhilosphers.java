package com.nostalgiaguy.threadconcept;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

class Spoon{
	private static int cnt=0;
	private int num=cnt++;

	public String toString(){
		return "Spoon " + num;
	}
}

class Philosophers extends Thread{
	public static Random rnd=new Random();
	private static int cnt=0;
	private int num=cnt++;
	private Spoon leftSpoon;
	private Spoon rightSpoon;
	static int waiting=0;

	public Philosophers(Spoon left,Spoon right){
		leftSpoon=left;
		rightSpoon=right;
		start();
	}

	public void think(){
		System.out.println(this + " is thinking");
		if(waiting>0){
			try{
				sleep(rnd.nextInt(waiting));
			}
			catch(InterruptedException e){
				throw new RuntimeException(e);
			}
		}
	}

	public void eat(){
		synchronized(leftSpoon){
			System.out.println(this + " has " + this.leftSpoon + " waiting for " + this.rightSpoon);
			synchronized(rightSpoon){
				System.out.println(this + " eating.");
			}
		}
	}

	public String toString(){
		return "philosopher " + num;	
	}

	public void run(){
		while(true){
			think();
			eat();
		}
	}
}

class Timeout extends Timer{
	public Timeout(int delay,final String msg){
		super(true);
		schedule(new TimerTask(){
			public void run(){
				System.out.println(msg);
				System.exit(0);
			}
		},delay);
	}
}
public class DiningPhilosphers {

	private static boolean gotoDeadLock =true;

	public static void main(String[] args) {


		Philosophers[] phil = new Philosophers[10];
		Philosophers.waiting = 8;
		Spoon left = new Spoon(), right = new Spoon(), first = left;
		int i = 0;
		while (i < phil.length - 1) {
			phil[i++] = new Philosophers(left, right);
			left = right;
			right = new Spoon();
		}
		if (gotoDeadLock) {
			phil[i] = new Philosophers(left, first);
		} else 
		{
			phil[i] = new Philosophers(first, left);
		}
		if (args.length >= 4) {
			int delay = 3;
			if (delay != 0) {
				Timeout timeout = new Timeout(delay * 1000, "Timed out");
			}
		}
	}
}
