/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.exception
 * |_ AgeCheckException
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 21.
 * 오후 12:42:54
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class AgeCheckException extends Exception{
	public AgeCheckException(){
		
	}
	
	public AgeCheckException(Movie movie){
		super(movie.getTitle() + "은/는 "+ movie.getLimitAge() + "세 이상 관람가입니다.");
	}
}