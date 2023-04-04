
import java.util.random;

public class Area {

    

        // El area de un triangulo

        int base;
        int altura;

        base=13;
        altura=14;

        // Voy a obtener un resultado 
        float answer;

        answer=(base*altura)/2;

        if (answer>100){
            System.out.print("El area de l triangulo es mayor a 100"+ answer);
        }else{
            System.out.println("El area del triangulo es menor a 100 "+ answer);
        }

        double alea;
        alea=Math.random();
        System.out.println(alea);
        System.out.println(alea*100);
        System.out.println(alea*101);
        System.out.println((alea*7 ));
        //System.out.println((int)99.9);



    }
    
}
