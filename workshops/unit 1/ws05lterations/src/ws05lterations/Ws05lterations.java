
package ws05lterations;

import java.io.PrintStream;

public class Ws05lterations {

    public static void main(String[] args) {
        int i;
        i = 0;
        System.out.println("==== This is while loop from 1 to 10 ====");
        while(i<10){
            System.out.print("i ->" + (i+1));
            //i+=1;
            i++;
            //i = i + 1;
        }
        System.out.print("first 5 even numbers");
        i=2;
        while(i<10){
            System.out.print(i + "-> is even");
            i += 2;
        }
        System.out.println("first 5 odd numbers");
        int stop;
        stop=20;
        for(int j=1; j<stop ; j+=2){
            System.out.print("odd number ->" + j);
        }
         System.out.print("Multiplication tables : 9");
         int top=12;
         int product=0;
         int table=9;
        int j;
         for (j=1;top>j; j++){
              product = table * j;
            System.out.println("9 * " +j+ " = "+product);
        }
                                                                       
        double celsius;
        System.out.printf(" ºF \t  ºC \n");
        System.out.println("---------------");
        for (int fahrenheit = 10; fahrenheit <= 100; fahrenheit+= 10) {                                           
             celsius = (fahrenheit - 32)*5/9.0;
             System.out.printf("%3d\t%6.2f \n", fahrenheit, celsius);
        }
    }
}