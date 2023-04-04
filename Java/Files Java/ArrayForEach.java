
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArrayForEach {
    public static void main(String[] args){

        Scanner entrada= new Scanner(System.in);

        System.out.print("Ingrese cuantos elementos quiere tener mi array: ");
        int cantidad=entrada.nextInt();

        String[] paises= new String[cantidad];

        for (int i=0; i<paises.length;i+=1){
            paises[i]=JOptionPane.showInputDialog("Introduce el pais numero" +(i+1));

        }

        for(int j=0; j<paises.length;j+=1){
            System.out.println("El pais numero "+(j+1)+" es: "+paises[j]);
            
        }
        
        
    }
    
}
