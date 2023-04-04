
import java.util.Scanner; //.* Importa todas las clases

public class InputScannerImpo {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);//Estamos creando una variable de Scanner, y le damos un valor de un objeto pasmos como parametro System.in

        System.out.print("Introduce un nombre: ");
        
        String nombreUser;
        nombreUser=entrada.nextLine();


        int edad;
        System.out.print("Introduzca su edad: ");
        edad=entrada.nextInt();//en esta variable se va a guardar el la linea de entrada always nexType como no es estatico no se pone la libreria
        
    }
    
}
