/*Q3. Demonstrate the use of sleep() method to pause a thread for some time.*/

import java.util.*;
public class Demo_Sleep_Method{
	public static void main(String x[]){
		Test1 t1 = new Test1();
		t1.start();

		Test2 t2 = new Test2();
		t2.start();
	}
}

class Test1 extends Thread{
	public void run(){
		try{
			for(int i = 1; i <= 5; i++){
				System.out.printf("First Thread=%d\n", i, isAlive());
				Thread.sleep(10000);	
			}
		}
		catch(InterruptedException ex){
			System.out.print("Error is: "+ ex);
		}
	}
}

class Test2 extends Thread{
	public void run(){
		try{
			for(int i = 1; i <= 50; i++){
				System.out.printf("Second Thread=%d\n", i);
				Thread.sleep(1000);	
			}
		}
		catch(InterruptedException ex){
			System.out.print("Error is: "+ ex);	
		}
	}
}