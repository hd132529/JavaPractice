/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.inheritance
 * |_ Rec
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * 오후 3:29:42
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class Rec extends Figure{
	private int height;
	private int width;
	
	public Rec(int width, int height) {
		super(0, 0);
		this.width = width;
		this.height = height;
	}
	
	public Rec(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}

	protected double calcArea() {
		return (width * height);
	}
	

}