/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.oop
 * |_ Car
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 13.
 * 오전 11:06:29
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class Car {

	/**
	 * @param args
	 */
		// TODO Auto-generated method stub
		private String company;
		private String model;
		private String color;
		private int maxspeed;
		private int price;
		
		public String getCompany(){
			return company;
		}
		public String getModel(){
			return model;
		}
		public String getColor(){
			return color;
		}
		public int getMaxSpeed(){
			return maxspeed;
		}
		public int getPrice(){
			return price;
		}
		
		public void setCompany(String newCompany) {
			company=newCompany;
		}
		public void setModel(String newModel) {
			model=newModel;
		}
		public void setColor(String newColor) {
			color=newColor;
		}
		public void setMaxSpeed(int newMaxSpeed) {
			maxspeed=newMaxSpeed;
		}
		public void setPrice(int newPrice) {
			price=newPrice;
		}
		
		
		
		
 	}

