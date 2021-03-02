package Arvestus;

import java.util.*;

public class Murrud {

    static void taandamine(int z1, int z2) {

        for (int i = z2-1; i > 2; i--) {
            if (z1%i == 0 && z2%i == 0) {
                z1 = z1/i;
                z2 = z2/i;
                System.out.println(z1+"/"+z2);
            }
        }
    }

    static void segaarv(int x1, int x2) {
        
        int uusLugeja, taisArv;

        if (x1 == 0 || x2 == 0) {
            System.out.println("arv ei eksisteeri!");
        } else if (x1 < x2) {
            taandamine(x1, x2);
        } else if (x1%x2 == 0){
            taisArv = x1/x2;
            System.out.println(taisArv);
        } else {
            taisArv = x1/x2;
            uusLugeja = x1%x2;
            System.out.print(taisArv+" ");
            taandamine(uusLugeja, x2);
        }

    }

    static void liitmine(int y1, int y2, int y3, int y4) {
        
        int liitLugeja, liitNimetaja;
        liitLugeja = y1*y4 + y3*y2;
        liitNimetaja = y2*y4;

        segaarv(liitLugeja, liitNimetaja);
        
    }
    public static void main(String[] args) {

        System.out.println("Tere tulemast murdude arvutamise programmi!\n1)Sisestad kaks murdu.\n2)Neid esitatakse segaarvuna.\n3)Vastust taandatakse.");
        System.out.println();

        int lugeja1, nimetaja1, arv1, lugeja2, nimetaja2, arv2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Esimene arv.\nLugeja: ");
        lugeja1 = sc.nextInt();
        System.out.print("Nimetaja: ");
        nimetaja1 = sc.nextInt();
        System.out.print("Sinu esimene arv on: ");
        segaarv(lugeja1, nimetaja1);
        System.out.println();

        System.out.print("Teine arv.\nLugeja: ");
        lugeja2 = sc.nextInt();
        System.out.print("Nimetaja: ");
        nimetaja2 = sc.nextInt();
        System.out.print("Sinu teine arv on: ");
        segaarv(lugeja2, nimetaja2);
        System.out.println();

        System.out.print("Arvude summa on: ");
        liitmine(lugeja1, nimetaja1, lugeja2, nimetaja2);
        System.out.println();

    }        

}