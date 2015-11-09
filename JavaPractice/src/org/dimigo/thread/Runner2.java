package org.dimigo.thread;

/**
 * @author 2529�幮��
 * @version : 1.0
 & 
 * Projects JavaPractice
 * Package  org.dimigo.thread
 * Class    Runner
 * 
 */
public class Runner2 implements Runnable{
	private String name;
	
	public Runner2(){}
	
	public Runner2(String name){
		this.name = name; 
	}
	
	@Override
	public void run(){
		int distance = 100;
		System.out.println(name + " ���");
		do{
			System.out.println(name + " " + distance + " ����");
			distance -= 10;
			try{
				Thread.sleep(1000);
			} catch(Exception e){
				e.printStackTrace();
			}
		} while(distance >= 0);
		System.out.println(name + " ����");
	}
}