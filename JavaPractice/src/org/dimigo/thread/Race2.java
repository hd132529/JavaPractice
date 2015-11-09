package org.dimigo.thread;

/**
 * @author 2529�幮��
 * @version : 1.0
 & 
 * Projects JavaPractice
 * Package  org.dimigo.thread
 * Class    Race
 * 
 */
public class Race2 {
	public static void main(String[] args){
		System.out.println("main thread start");
		
		Thread t1 = new Thread(new Runner2("ö��"));
		Thread t2 = new Thread(new Runner2("����"));
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");
	}
}