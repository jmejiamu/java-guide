
package javaguide;

/**
 *
 * @author JoseMejia62
 */
public class Casting {
    public static void wideningCasting(){
        int age = 20;
        
        double ageToDouble = age;
        
        System.out.println("Int - " + age);
        System.out.println("Casting age to double - " + ageToDouble);
    }
    
    public static void narrowCasting(){
        double total = 23.70d;
        int totalToInt  =  (int) total;
        
        System.out.println("Double  - " + total);
        System.out.println("Total to int - " + totalToInt);
    }
}
