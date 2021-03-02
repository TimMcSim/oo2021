package kodutoo_20210216;

public class Main {
    public static void main(String[] args) {
        
        SheepCount maksim = new SheepCount("Maksim");
        System.out.println(maksim.explanation());
        System.out.println(maksim.oneTwoThree());
        System.out.println();

        SheepCount someOneElse = new SheepCount("Harry");
        System.out.println(someOneElse.explanation());
        System.out.println(someOneElse.oneTwoThree());
        System.out.println();

    }
}