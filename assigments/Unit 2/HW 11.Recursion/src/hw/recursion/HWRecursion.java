package hw.recursion;

/**
 *
 * @author Tania Lizeth 
 */
public class HWRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 4;
        int SumRecursive;
        int result = SumRecursive (n);
        System.out.println( " The Sum Recursive the " + n + "is" + result);
        
     }
    public static int SumRecursive (int n) {
        int result;
        if (n==1) {
            return 1;
        } else {
            return result = (n + SumRecursive( n - 1));
        }
    }
    
}
