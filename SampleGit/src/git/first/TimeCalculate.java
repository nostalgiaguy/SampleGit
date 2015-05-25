package git.first;

import java.util.Scanner;

public class TimeCalculate {

	public   int check_in_time;
	public   int before_arrival_hrs;
	public  int deadline_time;
		
	public void getBeforeArrivalDeadline(){
		deadline_time=check_in_time-before_arrival_hrs;
		if(deadline_time>0){
			System.out.println("before arrival deadline_time: "+ deadline_time+" O'clock");
		}
		if(deadline_time<0){
			deadline_time=24+deadline_time;
			System.out.println("before arrival deadline_time: "+ deadline_time+" O'clock");
		}
		if(deadline_time==0){
			System.out.println("before arrival deadline_time: "+ check_in_time+" O'clock");
		}
	}
	public static void main(String[] args) {

		TimeCalculate tc=new TimeCalculate();
		Scanner in = new Scanner(System.in); 
		System.out.print("enter check_in_time: ");
		tc.check_in_time=in.nextInt();	
		System.out.print("enter before_arrival_hrs: ");
		tc.before_arrival_hrs=in.nextInt();
		if(tc.before_arrival_hrs>24){
			tc.before_arrival_hrs=	tc.before_arrival_hrs%24;
		}
		tc.getBeforeArrivalDeadline();
	}
}
