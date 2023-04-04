

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.*;

public class AreasGeneral {
    public static void main (String[] args){

        Scanner entrada=new Scanner(System.in);
        
        //Creacio de escoger el area de una figura


        System.out.print("Ingrese el area a realizar: ");

        String area=entrada.nextLine();
        area=area.toLowerCase();//Convierto a minuscula lo que me pase el usuario

        if ("cuadrado".equals(area)){
            double lado, ans;

            String lado1=JOptionPane.showInputDialog("Ingrese el lado del"+area);
            lado=Double.parseDouble(lado1);

            ans=Math.pow(lado, 2);

            System.out.print("El area del "+area+" es: "+ans);

        }else if("rectangulo".equals(area)){
            double base, altura,ans;

            String base1=JOptionPane.showInputDialog("Ingrese la base del"+area);
            base=Double.parseDouble(base1);

            String altura1=JOptionPane.showInputDialog("Ingrese la altura del"+area);
            altura=Double.parseDouble(altura1);

            ans=(base*altura);

            System.out.print("El area del "+area+" es: "+ans);
        }else if("triangulo".equals(area)){
            double base, altura,ans;

            String base1=JOptionPane.showInputDialog("Ingrese la base del"+area);
            base=Double.parseDouble(base1);

            String altura1=JOptionPane.showInputDialog("Ingrese la base del"+area);
            altura=Double.parseDouble(altura1);

            ans=(base*altura)/2;

            System.out.print("El area del "+area+" es: "+ans);
            
        }else if("circulo".equals(area)){
            double radio, ans;

            String radio1=JOptionPane.showInputDialog("Ingrese el radio del"+area);
            radio=Float.parseFloat(radio1);

          
            ans=(Math.PI*(Math.pow(radio, 2)));
            JOptionPane.showMessageDialog(null, "El area del "+area+" es: "+ans);
            //System.out.print();
            
        }

    }
}
