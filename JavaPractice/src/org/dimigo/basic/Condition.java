package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본요금 - 고속버스 : 850원 경차 : 300원 그외 600원
		// 10km초과시마다 고속버스는 300원씩 추가, 경차와 그 외는 200원씩 추가
		// 예) 고속버스로 10km 주행 : 850원, ~20km주행: 1150원, ~30km: 1450원
		// 예) 경차로 10km 주행 : 300원, ~20km주행: 500원, ~30km: 700원
		
		String buslist = "고속버스";
		int bus = 850;
		int midieum = 300;
		int other = 600;
		int distance = 10;
		
		if(distance < 0) {
			System.out.println("거리는 양수로 써주세요");
		}
		else if(distance <=10) {
		}
		else if(distance<=20) {
			bus = bus+300;
			midieum = midieum+200;
			other = other+200;
		}
		else if(distance<=30) {
			bus = bus+600;
			midieum = midieum+400;
			other = other+400;
		}
		
		
		System.out.println("<< 고속도로 통행료 계산 >>\n");
		System.out.printf("거리 : %dkm\n",distance);
		System.out.printf("차종 : %s\n",buslist);
		System.out.printf("통행료 : %d원\n",bus);
		
	}

}
