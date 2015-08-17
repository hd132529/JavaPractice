/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.inheritance
 * |_ Figure
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * 오후 3:29:14
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class Figure {
	protected int centerX;
	protected int centerY;
	
	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea() {
		return 0.0;
	}
	protected void printCenter(){
		System.out.println("중심좌표 : ("+centerX+","+centerY+")");
	}
	protected void moveFigure(int x, int y){
		centerX += x;
		centerY += y;
	}
}