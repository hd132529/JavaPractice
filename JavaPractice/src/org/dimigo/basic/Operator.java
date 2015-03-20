package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1 =9;
		int b1 =10;
		double h1 =5.8;
		int a2 = 9;
		double h2 = 5.4;
		
		double sada =  ((a1+b1)*h1)/2;
		double pang =(a2*h2);
		
		System.out.println("<<도형 넓이 비교 >>");
		System.out.printf("사다리꼴 넓이: %.1f\n", sada);
		System.out.printf("평행사변형 넓이: %.1f\n\n", pang);
		
		if(sada > pang)
		{ 
			System.out.printf("사다리꼴이 평행사변형 보다 %.1f 더 큽니다.",sada-pang);
		}
		else if(sada == pang)
		{
			System.out.printf("평행사변형이 사다리꼴 보다 %.1f 더 큽니다.",pang-sada);
	}
		else System.out.println("평행사변형과 사다리꼴의 넓이가 같습니다.");
	}
}
