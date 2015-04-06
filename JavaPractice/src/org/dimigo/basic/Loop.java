/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.basic
 * |_ Loop
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 3.
 * 오후 2:04:01
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int i,j;
		for(i=0; i<10; i++)
		{	
			for(j=0; j<10; j++)
			{
				
				if(i==j)
				{
					System.out.printf("*");
				}
				else{
					System.out.printf("%d",j+1);
				}
			}
			System.out.printf("\n");
			
		}
		
	}

}
