/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.exception
 * |_ Movie
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 21.
 * 오후 12:22:50
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class Movie {
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge){
		this.title = title;
		this.limitAge = limitAge;
	}
	
	public String getTitle(){
		return title;
	}
	
	public int getLimitAge(){
		return limitAge;
	}
}