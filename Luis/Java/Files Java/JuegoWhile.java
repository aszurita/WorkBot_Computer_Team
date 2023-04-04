import java.util.Scanner;


public class JuegoWhile {
    public static void main (String[] args){
        Scanner entr=new Scanner(System.in);
        
        //Generate random numbers

        int ale,user=10008,cont=0;

        ale=(int)(Math.random()*101);//Rango de numeros de 0 a 100

        System.out.println(ale);
  
            if (ale!=user){
                while(ale!=user){
                    System.out.print("Adivine el numero de 0 al 100: ");
                    user=entr.nextInt();

                    if (user>ale){
                        System.out.println("El numero es menor");

                    }else{
                        System.out.println("El numero es mayor");
                    }
                    cont=cont+1;
                }
                System.out.print("Adivino el numero "+ale+" con "+(cont)+" intentos");
            
            }else if(ale==user){
                System.out.print("Adivino el numero "+ale+" al 1 intento");
            }
    }
    
}
