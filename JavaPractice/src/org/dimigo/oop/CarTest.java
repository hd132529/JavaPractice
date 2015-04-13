/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.oop
 * |_ CarTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 13.
 * 오전 11:09:39
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		System.out.println("<< 자동차 목록 >>");
		System.out.println("\n");
		car1.setCompany("현대자동차");
		car1.setModel("제네시스");
		car1.setColor("검정색");
		car1.setMaxSpeed(225);
		car1.setPrice(50000000);
		
		System.out.println(car1.getCompany());
		System.out.println(car1.getModel());
		System.out.println(car1.getColor());
		System.out.printf("%dkm\n",car1.getMaxSpeed());
		System.out.printf("%,d원",car1.getPrice());
		
		System.out.println("\n");
		
		car2.setCompany("기아자동차");
		car2.setModel("K7");
		car2.setColor("흰색");
		car2.setMaxSpeed(246);
		car2.setPrice(0);
		
		System.out.println(car2.getCompany());
		System.out.println(car2.getModel());
		System.out.println(car2.getColor());
		System.out.printf("%dkm\n",car2.getMaxSpeed());
		System.out.printf("%,d원",car2.getPrice());
		
		System.out.println("\n");
		
		car3.setCompany("삼성자동차");
		car3.setModel("SM7");
		car3.setColor("회색");
		car3.setMaxSpeed(0);
		car3.setPrice(0);
		
		System.out.println(car3.getCompany());
		System.out.println(car3.getModel());
		System.out.println(car3.getColor());
		System.out.printf("%dkm\n",car3.getMaxSpeed());
		System.out.printf("%,d원",car3.getPrice());
		
	}

}
