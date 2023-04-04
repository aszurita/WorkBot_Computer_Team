
import java.util.Scanner;

public class LoopsHack {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s;

            for(int  j=0; j<n;j=j+1){
                double expo= Math.pow(2, j);
                int expo2=(int) expo;
                
                s=a+(expo2*b);
                System.out.print(s+" ");
                a=s;
            }
            System.out.println();
        }
        in.close();

    }
    
}
