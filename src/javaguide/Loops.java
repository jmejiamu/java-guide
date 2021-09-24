package javaguide;

/**
 *
 * @author JoseMejia62
 */
public class Loops {
    public static void whileAndForLoops(){
        int count = 0;
        
        System.out.println("While loop");
        while(count < 5){
            System.out.println("Index " + count);
            count ++;
        }
        
        System.out.println("For Loop");
        for (int i = 0; i < 5; i++) {
            System.out.println("Index " + i);
        }
    }
}
