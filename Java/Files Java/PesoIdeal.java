import javax.swing.JOptionPane;

public class PesoIdeal {
    public static void main(String[] args){
        //Ingresar genero H o M

        String gene;
        gene=JOptionPane.showInputDialog("Ingrese su genero: ");

        gene=gene.toUpperCase();
        System.out.println(gene);
        while( !(gene.equals("M")||gene.equals("F"))    ){
            gene=JOptionPane.showInputDialog("Ingrese su genero: ");
            gene=gene.toUpperCase();
        }
    }
}
