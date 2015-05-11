/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.oop
 * |_ Question
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 11.
 * 오전 11:06:45
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("내가 오늘 가장 맛있엇던 음식은?");
		System.out.println("초성hint:ㅅㅌㄹㄸㄱㅂ\n");
		String answer = scanner.nextLine();
		
		if(answer.equals("스트링떡갈비")){
		System.out.println("맞아요!!");
	}
		else{
		System.out.println("틀려요!!");
		}
		scanner.close();
	}
	
}

