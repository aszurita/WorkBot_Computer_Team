
import javax.swing.*;;
public class PruebaFormat {

    public static void main(String[] args){

        String num;
        num=JOptionPane.showInputDialog("Introduce un numero: ");
         
        double numINt;
        numINt=Double.parseDouble(num);

        System.out.print(((Math.sqrt(numINt))));        



    }
    
}
