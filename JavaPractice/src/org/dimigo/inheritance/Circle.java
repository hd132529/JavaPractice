/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.inheritance
 * |_ Circle
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * 오후 3:29:25
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class Circle extends Figure{
	private int radius;
	
	public Circle(int radius) {
		super(0, 0);
		this.radius = radius;
	}
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	protected double calcArea() {
		return (radius * radius * 3.14);
	}
}