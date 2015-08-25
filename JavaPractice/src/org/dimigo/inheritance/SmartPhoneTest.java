/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.inheritance
 * |_ SmartPhoneTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 25.
 * 오전 10:27:54
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class SmartPhoneTest { 
    public static void main(String[] args) { 
         IPhone iPhone = new IPhone("iPhone 6", "애플", 700000); 
         System.out.println(iPhone); 
         iPhone.turnOn(); 
         iPhone.pay(); 
         iPhone.useSpecialFunction(); 
         iPhone.turnOff(); 
 
 
         Galaxy galaxy = new Galaxy("갤럭시 S6", "삼성", 650000); 
         System.out.println(galaxy); 
         galaxy.turnOn(); 
         galaxy.pay(); 
         galaxy.useSpecialFunction(); 
         galaxy.turnOff(); 
     } 
 } 
