/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebalibrocalificaciones;
import java.util.Scanner;

/**
 *
 * @author Jonanyu 11.1
 */
//Clase declarada 
public class PruebaLibroCalificaciones {

    /**
     * @param args the command line arguments
     */
    //Estamos creando el metodo MAIN
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        //Estamos llamando el metodo MostrarMensaje de la clase LibroCalificaciones
        
        
        //Creamos un objeto LibroCalificaciones y lo asigno a mi libroCalificaciones
        //Es como si declaras una variable como que tipo es int float String
        //En este caso declaras para crear un objeto 
        /*
        LibroCalificaciones miLibroCalificaciones=new LibroCalificaciones();
        
        System.out.print("Ingrese un curso: ");
        String curso=ent.nextLine();
        
        System.out.print("Ingrese ano del curso: ");
        int ano=ent.nextInt();
        
        //llama al metodo mostrarMensaje de miLibroCalificaciones
        miLibroCalificaciones.mostrarMensaje(curso,ano);
        
        miLibroCalificaciones.mostrarMensaje2();*/
        
        Scanner ent=new Scanner(System.in);
        System.out.print("Ingrese nombre del primer curso: ");
        String cursoInstr=ent.nextLine();
        
        System.out.print("Ingrese nombre del segundo curso: ");
        String cursoInstr2=ent.nextLine();
        ent.close();
        
        LibroCalificaciones curso= new LibroCalificaciones();//Objeto 1 o una aula
        LibroCalificaciones curso2= new LibroCalificaciones();//objeto 2 o aula 2
        
        
        curso.establecerNombreCurso(cursoInstr);
        curso2.establecerNombreCurso(cursoInstr2);
        
        curso.mostrarMensaje();
        curso2.mostrarMensaje();
        
        
        
        
        
        
        
        
        
        
    }
    
}
