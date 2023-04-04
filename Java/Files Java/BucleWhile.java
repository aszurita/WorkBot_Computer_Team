import java.util.Scanner;
import javax.swing.JOptionPane;;

public class BucleWhile {
    public static void main (String[] args){
        String clave="Luis",pasWo="";

        while(clave.equals(pasWo)==false){
            pasWo=JOptionPane.showInputDialog("Ingrese una contrasena: ");
            if (clave.equals(pasWo)==false){
                JOptionPane.showMessageDialog(null, "Constrasen Incorrecta");
            }
        }
        JOptionPane.showMessageDialog(null,"Acceso Correcto");
    }
}
