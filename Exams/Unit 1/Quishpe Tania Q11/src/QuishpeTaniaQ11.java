
import java.util.Scanner;

class Main {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        int opc, op1;
        System.out.print(" NOMBRE: TANIA QUISHPE ");
                        
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("Elija una opcion:\n1. Tabla de multiplicar del 6 \n0. Salir");
            System.out.print("Opcion: ");
            opc=leer.nextInt();1
            switch (opc) {
                case 1: System.out.print("*/*/*/*/*/ Caso 1 */*/*/*/*/*/ \n");
                int top=12;
                int producto=0;
                int table =6;
                for (int j =1 ;j<= top ;j++){
                    producto= table * j;
                    System.out.println(j + ".- "+ "6 * "+j+" = "+producto);
                }                    
                  
                    break;
                 
                   
                case 0: break;
                
                default:
                    System.out.println("keep practincing see you later");
                    System.out.println(0);    
                    break;
            }
        }while (opc!=0);
    }  
}


   

