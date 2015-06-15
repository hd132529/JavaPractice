/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.oop
 * |_ PiggyBank
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 12.
 * 오후 2:29:43
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class PiggyBank {
	private static int balance = 0;
	
	public static void putMoney(FamilyMember member, int amount){
		System.out.println(member.getMemberName() + " " + amount + "원 넣음");
		balance += amount;
	}
	
	public static void printBalance(){
		System.out.println("돼지저금통 총 금액 : " + balance + "원");
	}
}