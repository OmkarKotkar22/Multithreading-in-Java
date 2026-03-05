/*Q2. Create a thread by implementing Runnable interface and display thread names.*/

import java.util.*;
public class Display_Thread_Name{
public static void main(String x[]){
		Test t = new Test();
		System.out.println("Thread Name is: "+ Thread.currentThread().getName());
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);

		t1.start();
		t2.start();
		t3.start();
	}
}

class Test implements Runnable{
	public void run(){
		System.out.println("Thread Name is: "+ Thread.currentThread().getName());
	}
}

