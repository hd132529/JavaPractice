package org.dimigo.basic;

public class TypeCasting {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mpay=1700000;
		int supply=3;
		int market=1500;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.printf("월 평균 급여: %,d원\n",mpay);
		System.out.printf("점포 내 직원 수: %,d명\n",supply);
		System.out.printf("점포 수: %,d개\n\n",market);
		long yearpay=(long)mpay*(long)12*(long)supply*(long)market;
		System.out.printf("연간 인건비: %,d원",yearpay);

	}

}
