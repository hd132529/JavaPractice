/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.oop
 * |_ FamilyMember
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 12.
 * 오후 2:29:15
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class FamilyMember {
	private static int memberCnt = 0;
	private String memberName;
	
	public FamilyMember(String memberName){
		memberCnt++;
		this.memberName = memberName;
	}
	
	public String getMemberName(){
		return memberName;
	}
	
	public static int printMemberCnt(){
		return memberCnt;
	}
}