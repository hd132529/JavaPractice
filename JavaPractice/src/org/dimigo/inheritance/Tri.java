/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.inheritance
 * |_ Tri
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * 오후 3:29:36
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class Tri extends Figure{
	private int height;
	private int width;
	
	public Tri(int width, int height) {
		super(0, 0);
		this.width = width;
		this.height = height;
	}
	
	public Tri(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}

	protected double calcArea() {
		return (width * height * 0.5);
	}
}