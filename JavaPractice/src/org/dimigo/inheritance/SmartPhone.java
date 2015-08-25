/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.inheritance
 * |_ SmartPhone
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 25.
 * 오전 10:15:43
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class SmartPhone { 
    private String model, company; 
    private int price; 
 
   public SmartPhone() {} 
 
      public SmartPhone(String model, String company, int price) { 
         this.model = model; 
        this.company = company; 
         this.price = price; 
    } 
 
 
     public void turnOn() { 
         System.out.println(model+"의 전원을 켭니다"); 
     } 
 
 
     public void turnOff() { 
         System.out.println(model+"의 전원을 켭니다"); 
     } 
 
 
     public void pay() { 
     } 
 
 
     public void useSpecialFunction() { 
         if (this instanceof IPhone) { 
             ((IPhone) this).useAirDrop(); 
 
 
         } else if (this instanceof Galaxy) { 
             ((Galaxy) this).useWirelessCharging(); 
         } 
     } 
 
 
     @Override 
     public String toString() { 
         return String.format("모델명 : %s, 제조사: %s, 가격 : %,d원", model, company, price); 
     } 
 } 
