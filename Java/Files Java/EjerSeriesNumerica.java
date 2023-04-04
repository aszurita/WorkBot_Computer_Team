public class EjerSeriesNumerica {
    public static void main(String[] args){
        /*int i;
        //Ejercicio     1,99,2,98,3,97,4,96,5,95
        //Toma al ciclo como un for en python
        int con=99;
        for ( i=1;i<=5;i+=1){
            
            System.out.print(i+", "+con+", ");
            con=con-1;  
        } */

        //Ejercicio 2 0,1,1,2,3,5,8,13,21,34
        int i,j=0,k=1,s;
        for(i=0;i<=5;i++){
        
            System.out.println(j);     
            s=j+k;
            j=k;
            k=s;
            
        }


    }
}
