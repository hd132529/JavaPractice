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
	      Tri t = new Tri(10,10,5,8);
	      Rec r = new Rec(20,20,5,8);
	      
	      System.out.println(String.format("원의 넓이 : %.1f", c.calcArea()));
	      System.out.println(String.format("삼각형의 넓이 : %.1f", t.calcArea()));
	      System.out.println(String.format("사각형의 넓이 : %.1f", r.calcArea()));
	      System.out.println();
	      c.printCenter();
	      t.printCenter();
	      r.printCenter();
	      System.out.println();
	      System.out.println("--중심좌표 이동 (x,y축 5씩)");
	      System.out.println();
	      c.moveFigure(5,5);
	      t.moveFigure(5,5);
	      r.moveFigure(5,5);
	      c.printCenter();
	      t.printCenter();
	      r.printCenter();
	   }
	}