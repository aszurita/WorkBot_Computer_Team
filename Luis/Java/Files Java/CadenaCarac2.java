
import java.time.Year;

import javax.swing.JOptionPane;

public class CadenaCarac2 {

    //Porgrama2
    public static void main(String[] args){
    
        String usu,passw;

        usu=JOptionPane.showInputDialog("Ingrese el usuario");
        passw=JOptionPane.showInputDialog("Ingrese su contrasena");


        if (usu.equals("luis")&&(passw.equals("20226415"))){
            JOptionPane.showMessageDialog(null, "Inicio de sesion correctamente");
            
        }else{
            JOptionPane.showMessageDialog(null, "nombre de usuario o password incorrecto");
 
        }
         

    }
    
}
