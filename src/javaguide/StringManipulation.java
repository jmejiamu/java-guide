package javaguide;

/**
 *
 * @author JoseMejia62
 */
public class StringManipulation {
    public static void stringBasic(){
        String greeting = "Hello tech Twitter comunity!";
        String follow = ", follow JoseMejia62";
        
        System.out.println("The variable greeting has a length of " + greeting.length());
        
        System.out.println("Capital Letter " + greeting.toUpperCase());
        
        System.out.println("Concat two Strings " + greeting.concat(follow) );
    }
}