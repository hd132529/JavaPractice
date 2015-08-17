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
public class Rec extends Figure {
	private int width;
	private int height;
	public Rec(int width, int height) {
		super(0,0);
	}
	public Rec(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	protected double calcArea(){
		return width*height;
	}
	protected void printCenter(){
		System.out.println("중심좌표 : ("+centerX+","+centerY+")");
	}
}