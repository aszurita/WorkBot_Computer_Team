public class MathPrac {
    public static void main(String[] args) {

        /*int angle;

        angle=0;

        System.out.println(Math.cos(angle));*/

        // Manipula String
        String texto="El dia de hoy he aprendido mucho de Java nando";
        int posBegi,posEnd;
        String text2,text3;

        posBegi=texto.indexOf("hoy");
        posEnd=texto.indexOf("nando");

        text2=texto.substring(posBegi, posEnd);
        text3=texto.substring(posBegi);

        System.out.println(text2);
        System.out.println(text3);
        
        
    }
}
