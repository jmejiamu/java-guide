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
    
    public static void stringSpecialChar(){
  
        String text = "Joe\'s car";
        String path = "\\home\\username";
        
        System.out.println("Text " + text + "\n" + "next line");
        System.out.println("Testing path " + path);
    }
    
}
