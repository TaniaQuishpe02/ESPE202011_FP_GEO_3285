
package hw03iterations;

public class HW03Iterations {

   public static void main(String[] args) {
  
        int i;
        i = 0;
        System.out.println("==== This is while loop from 1 to 34 ====");
        while(i<34){
            System.out.print("i ->" + (i+1));
            //i+=1;
            i++;
            //i = i + 1;
        }
        System.out.print("Multiplication tables : 34");
         int top=12;
         int product=0;
         int table=34;
        int j;
         for (j=1;top>j; j++){
              product = table * j;
            System.out.println("9 * " +j+ " = "+product);
            
        
        double celsius;
        System.out.printf(" ºF \t  ºC \n");
        System.out.println("---------------");
        for (int fahrenheit = 10; fahrenheit <= 100; fahrenheit+= 10) {                                           
             celsius = (fahrenheit - 32)*5/9.0;
             System.out.printf("%HW3d\t%6.2f \n", fahrenheit, celsius);
        }
    }

