package javaguide;

/**
 *
 * @author JoseMejia62
 */
public class ContinueBreak {

    public static void breakExample() {
        for (int i = 0; i < 6; i++) {
            if (i == 2) {
                System.out.println("Stop");// Condtion is met then it will stop the iteration
                break;
            }
            System.out.println(i);
        }
    }

    public static void continueExample() {
        for (int i = 0; i < 6; i++) {
            if (i == 2) {
                System.out.println("Continue"); //breaks when when the condition is met then continue the iteration. 
                continue;
            }
            System.out.println(i);
        }
    }
}
