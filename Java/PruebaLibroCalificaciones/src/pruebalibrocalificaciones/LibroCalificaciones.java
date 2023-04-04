/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebalibrocalificaciones;

/**
 *
 * @author Jonanyu 11.1
 */
//declaracion de una clase con un metodo

public class LibroCalificaciones {

    //Creacion de otro metodo de con parametro
    /*public void mostrarMensaje(String nombreDelCurso,int ano){
        
        int []arAno={2021,2022,2023,1985,1988,2000,2014,2018};
        
        int lon;
        lon = arAno.length;
        
   
        for (int i=0;i<lon;i+=1){
            if(arAno[i]==ano){
                System.out.println("Bienvenido al libro de calificaciones de "+nombreDelCurso+" correspondiente al ano "+ano);
                
        }
     
        
        }
        
        
    }*/
    /*
    //Creacion de otro metodo sin parametro 
    public void mostrarMensaje2(){
        System.out.println("Que tengas un excelente dia");
        
    }//fin del metodos mostrar mensaje*/
    
    
    
    //Esto es lo que tiene un objeto por defecto por si decirlo se puede modificar al momento de realizar o crear los objetos
    //Esto es un atributo
    private String NombreCurso;
    
    //Primer metodo Esatblecer Nombre del Curso
    
    public void establecerNombreCurso(String nombre){
        NombreCurso=nombre;
    }
    
    //Second metod obtener el nombre del curso
    public String obtenerNombreCurso(){
        return NombreCurso;
    }
    
    //Third metod mostrar mensaje
    public void mostrarMensaje(){
        String nombreCurso=obtenerNombreCurso();
        
        System.out.println("Bienvenido al curso: "+nombreCurso);
        
    }
    
    
    
    
}
