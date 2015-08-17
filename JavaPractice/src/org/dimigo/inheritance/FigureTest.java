/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.inheritance
 * |_ FigureTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * 오후 3:29:57
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class FigureTest {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		Tri t = new Tri(10, 10, 5, 8);
		Rec r = new Rec(20, 20, 5, 8);

		System.out.println("원의 넓이 : " + c.calcArea());
		System.out.println("삼각형의 넓이 : " + t.calcArea());
		System.out.println("사각형의 넓이 : " + r.calcArea());
	}
}