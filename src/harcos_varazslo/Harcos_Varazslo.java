package harcos_varazslo;

import java.util.Random;

public class Harcos_Varazslo {

    public static void main(String[] args) {
        Random rnd = new Random();

        System.out.println("HARCOS ÉS A VARÁZSLÓ:");
        System.out.println("H _ V");
        int harcos;
        int varazslo;

        for (int i = 1; i <= 9; i++) {
            harcos = rnd.nextInt(1, 3);
            varazslo = rnd.nextInt(1, 3);
            
            String mezo1 = harcos == 1 ? "H" : "_";
            String mezo2 = harcos == 2 ? "H" : "_";
            String mezo3 = harcos == 3 ? "H" : "_";

            mezo1 = varazslo == 1 ? "V" : mezo1;
            mezo2 = varazslo == 2 ? "V" : mezo2;
            mezo3 = varazslo == 3 ? "V" : mezo3;

            if (varazslo == harcos) {
                mezo1 = varazslo == 1 ? "X" : mezo1;
                mezo2 = varazslo == 2 ? "X" : mezo2;
                mezo3 = varazslo == 3 ? "X" : mezo3;
            }
            System.out.println(mezo1 + " " + mezo2 + " " + mezo3);
            

        }

    }

}
