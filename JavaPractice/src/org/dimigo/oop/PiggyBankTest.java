/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.oop
 * |_ PiggyBankTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 12.
 * 오후 2:30:07
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
	public class PiggyBankTest {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			FamilyMember family[] = {new FamilyMember("아빠"),
									 new FamilyMember("엄마"),
									 new FamilyMember("나"),
									 new FamilyMember("남동생")
									};
			
			System.out.println("가족 총 인원 수 : " + FamilyMember.printMemberCnt() + "명");
			
			PiggyBank.putMoney(family[0], 10000);
			PiggyBank.putMoney(family[1], 5000);
			PiggyBank.putMoney(family[2], 2000);
			PiggyBank.putMoney(family[3], 1000);

			PiggyBank.printBalance();
			
			PiggyBank.putMoney(family[2], 1000);
			
			PiggyBank.printBalance();
		}

	}