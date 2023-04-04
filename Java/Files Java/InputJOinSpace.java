import javax.swing.JOptionPane;


public class InputJOinSpace {
    public static void main(String [] args){


        //Como es estatico no tenemo que istanciar
       
        String nombre,lado1;
        int ed;

        nombre=JOptionPane.showInputDialog("introduce tu nombre: ");//Siempre esto nos va a devolver un string
        //edad=JOptionPane.showInputDialog("Introduzca la edad: ");
        ed=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad: "));//Converti es -> parseInt() o parseType()
        
        
        System.out.println(ed+1);
        lado1=JOptionPane.showInputDialog("Ingrse el lado del");
    }
}
