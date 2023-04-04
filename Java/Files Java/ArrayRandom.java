

import java.util.Arrays;
public class ArrayRandom {

    public static void main(String[] args){

        //Matriz de numeros enteros
        int[] numAle= new int[25];

        //Rellenar con numeros aleatorios

        for (int i=0;i<numAle.length;i+=1){
            numAle[i]= (int) Math.round(Math.random()*100);
        }
       
        for(int j=0;j<(numAle.length);j+=1){
            for(int k=0;k<(numAle.length);k+=1){
                while(numAle[j]==numAle[k]){
                    numAle[k]= (int) Math.round(Math.random()*100);
                }
            }          

        }

        for(int z=0;z<numAle.length;z+=1){
            System.out.println(numAle[z]);

        }

    }

    
}   
    

