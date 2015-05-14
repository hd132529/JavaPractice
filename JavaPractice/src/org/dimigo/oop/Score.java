/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;


/**
 * <pre>
 * JavaPractice
 * org.dimigo.oop
 * |_ Score
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 14.
 * 오후 12:19:11
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수 입력-> ");
		int kor=scanner.nextInt();
		System.out.println("수학점수입력-> ");
		int math=scanner.nextInt();
		System.out.println("영어점수입력-> ");
		int eng= scanner.nextInt();
		scanner.close();
		
		int sum=kor+math+eng;
		StringBuffer grade = new StringBuffer();
	
		grade.append("<< 점수 출력 >>\n")
		.append("국어점수: "+kor+"점"+"\n")
		.append("수학점수: "+math+"점"+"\n")
		.append("영어점수: "+eng+"점"+"\n")
		.append("총점: "+sum+"점"+"\n")
		.append("평균: "+String.format("%.1f",(double)sum/3)+"점").toString();
		
		System.out.println(grade);
		
	}

}
