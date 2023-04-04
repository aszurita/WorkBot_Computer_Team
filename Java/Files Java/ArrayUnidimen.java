public class ArrayUnidimen {

    public static void main(String[] args){
        float[] num=new float[10];

        //int[] num={1,2,3,4,5,6,7,8,9,10};

        int lon;
        lon=num.length;

        for(int i=0;i<lon;i+=1){
            System.out.print((num[i]=i+1)+" ");
        }
        
        for (int j=0;j<lon;j+=1){
            if (j<=5){
                num[j]=23;
            }
        }

        for(int k=0;k<lon;k+=1){
            System.out.println(num[k]);
        }




    }
    
}
