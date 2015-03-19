/******************************
 * <
 */




package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="아이유";
		boolean flag = true;
		int year=23;
		double height = 161.8d;
		float weight=44.3f;
		char bloodtype='A';
		
		System.out.printf("<<아이유 프로필>>\n");
		System.out.printf("이름 : %s\n",name);
		if(flag) {
			System.out.println("성별: 여자");
		}else {
			System.out.println("성별: 남자");
		}
		System.out.printf("나이 :%d세\n",year);
		System.out.printf("키:%.1fcm\n",height);
		System.out.printf("몸무게:%.1fkg\n",weight);
		System.out.printf("혈액형:%c형\n",bloodtype);
		
		

	}

}
