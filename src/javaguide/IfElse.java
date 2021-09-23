package javaguide;

/**
 *
 * @author JoseMejia62
 */
public class IfElse {
    public static void ifElseStatement(){
        int youngerAge = 16;
        int adultAge = 25;
        
        if(adultAge > 18){ // true
            System.out.println("Enter Please!"); // run this code
        }else{
            System.out.println("You Cannot Enter!"); // run this is the condition return false
        }
        

    }
    
    public static void ternaryOperator (){
        int youngerAge = 16;
        int adultAge = 25;
        
        //Ternary Operator
        String authorization = (youngerAge > 18) ? "Enter Please!" : "You cannot Enter!";
        
        System.out.println(authorization);
    }
}
