
package ws08.debugging;

import java.util.Scanner;

public class WS08Debugging {

    public static void main(String[] args) {
        // TODO code application logic here
        int multiplicand;
        int multiplier;
        int product;
        int stop; 
        stop = 12;
        do {
            System.out.println("Enter the table you want to study");
            System.out.println("0. (cero) to exit -->");
            Scanner input = new Scanner (System.in);
            multiplicand = input.nextInt();
            if (multiplicand!=0) {
                System.out.println("Studynig the table at -->" + multiplicand + " <---");
                for (multiplier = 1; multiplier<=stop; multiplier++){ 
                    product = multiplicand * multiplier;
                    System.out.println( multiplicand +" * " + multiplier + " - "  + product );
                    }
            }            
        }while(multiplicand!=0);
        System.out.println("God Bye");
    }
}
