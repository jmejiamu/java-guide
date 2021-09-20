package javaguide;

/**
 *
 * @author JoseMejia62
 */
public class Operartor {
    public static void basicOperator(){
        // Arithmetic Operator
        int total = 20 + 30;
        System.out.println("Total is: " + total); // 50
        
        //Assignment Operator
        int x = 5;
        x += 5;
        System.out.println("Final value of x " + x); // 10
        
        //Comparison Operator
        boolean equalTo = 4 == 4;
        System.out.println("Equal - "+ equalTo ); // true
        
        //Logical Operator
        boolean logicalAnd =  3 > 2 && 1 < 8;
        System.out.println("Logic and - " + logicalAnd); // true
        
        
    }
}
