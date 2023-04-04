import java.util.Scanner;

public class CompaniaCoca {
    public static void main(String[] args){
        //Solicita NOMBRE, CLAVE DEL DEPARTAMENTO,ANTIUEDAD

        Scanner entra= new Scanner(System.in);

        String Nombre;
        int clave;

        System.out.print("Ingrse su nombre: ");
        Nombre=entra.nextLine();

        System.out.println();
        System.out.print("Claves de departamento \n 1. Departamento de Atencion al Cliente \n 2. Departamento de Logística \n 3. Gerencia\nIngrese su clave: ");
        clave=entra.nextInt();  
              

        switch (clave){
        case 1:
            System.out.print("Ingrese sus Anos de Servicio: ");
            int anos=entra.nextInt();
            if (anos>=1 && anos<2){
                System.out.println();
                System.out.println("Sr. o Sra " +Nombre);
                System.out.print("Usted tiene 6 días de vacaciones");
            }else if(anos>=2 && anos<=6){
                System.out.println();
                System.out.println("Sr. o Sra " +Nombre);
                System.out.print("Usted tiene 14 días de vacaciones");
            }else if(anos>=7){
                System.out.println();
                System.out.println("Sr. o Sra " +Nombre);
                System.out.print("Usted tiene 20 días de vacaciones");
            }
            break;
            
        case 2:
            System.out.print("Ingrese sus Anos de Servicio: ");
            anos=entra.nextInt();
            if (anos>=1 && anos<2){
                System.out.println();
                System.out.println("Sr. o Sra " +Nombre);
                System.out.print("Usted tiene 7 días de vacaciones");
            }else if(anos>=2 && anos<=6){
                System.out.println();
                System.out.println("Sr. o Sra " +Nombre);
                System.out.print("Usted tiene 15 días de vacaciones");
            }else if(anos>=7){
                System.out.println();
                System.out.println("Sr. o Sra " +Nombre);
                System.out.print("Usted tiene 22 días de vacaciones");
            }
            break;
            
        case 3:
            System.out.print("Ingrese sus Anos de Servicio: ");
            anos=entra.nextInt();
            if (anos>=1 && anos<2){
                System.out.println();
                System.out.println("Sr. o Sra " +Nombre);
                System.out.print("Usted tiene 10 días de vacaciones");
            }else if(anos>=2 && anos<=6){
                System.out.println();
                System.out.println("Sr. o Sra " +Nombre);
                System.out.print("Usted tiene 20 días de vacaciones");
            }else if(anos>=7){
                System.out.println();
                System.out.println("Sr. o Sra " +Nombre);
                System.out.print("Usted tiene 30 días de vacaciones");
            }
            break;

        default:
            System.out.print("Ingrese una opcion correcta"); 
                
        }

    }
    
}
