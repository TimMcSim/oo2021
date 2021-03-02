import java.util.Scanner;

public class Kodutoo_20210209{

    static int tempResult(int x, int y) {

        int temp1 = 0;

        if (x == 1) {

            temp1 = ((y * 9)/5) + 32;
        }

    // (0 °C × 9/5) + 32 = 32 °F

        if (x == 2) {
        
            temp1 = ((y - 32) * 5)/9;
        }
        return temp1;
    }
    public static void main(String[] args){

        System.out.println("See arvutiprogramm konventeerib temperatuurid tselsiuse ja farenheiti skaalade vahel.");
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Mis skaalast konverteerime? Sisesta '1' kui tselsius või '2' kui farenheit: ");
        int andmed = in.nextInt();

        System.out.print("Sisesta temperatuuri väärtus: ");
        int temperat = in.nextInt();

        int tempviimane = tempResult(andmed, temperat);

        if (andmed == 1) {

            System.out.print("Farenheiti skaalas see väärtus on: ");
            System.out.print(tempviimane);
            System.out.println("°F");
        }

        if (andmed == 2) {
        
            System.out.print("Tselsiuse skaalas see väärtus on: ");
            System.out.print(tempviimane);
            System.out.println("°C");
        }

    }
      
}
