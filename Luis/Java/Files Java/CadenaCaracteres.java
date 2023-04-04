
import java.util.Scanner;

public class CadenaCaracteres {

    public static void  main(String[] args) {
        
        //Incializar variables
        //String nombre="";
        //Comparar valores
        //nombre=="Juan";
        //nombre.equals("Juan");

        Scanner en= new Scanner(System.in);
        String nom1="", nom2="";

        System.out.print("Ingrese el primer nomrbre: ");
        nom1=en.nextLine();

        System.out.print("Ingrese el segundo nombre: ");
        nom2=en.nextLine();


        if (nom1.equals(nom2)){
            System.out.println("Los nombres son iguales");
        
        }else{
            System.out.println("Los nombres no son iguales");
        
        }





        
    }
    
}
