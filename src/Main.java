//import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int max=99;
        int min=10;
        int range= max - min +1;

        int grandezza=20;
        int[] vett1=new int[grandezza];

        for (int i = 0; i < grandezza; i++) {
            vett1[i]=(int) (Math.random()*range)+min;
                    //(int) per leggere come int il valore double
            while (vett1[i]%2==0) {
                vett1[i] = (int) (Math.random() * range) + min;
            }
            System.out.println(""+vett1[i]);
        }

        System.out.println("Qui la sequenza rivista:\n\n");


        for (int i = 0; i < grandezza; i++) {
            if (i%2!=0){
                vett1[i]=vett1[i]+vett1[i-1];
            }

            System.out.println(""+vett1[i]);
        }


    }
}