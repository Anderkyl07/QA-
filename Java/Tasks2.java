public class Tasks2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 11;
        int d = 2;

        System.out.println(a*b);
        System.out.println(a+b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(c%d);
        System.out.println(a==c);

        System.out.println(a/2);
        System.out.println( b % 2 == 0);
        System.out.println(b % 2 != 0);



        int treasure = 100;
        int shopOwner = treasure/2;
        int captain = (treasure - shopOwner)/2;
        int team = 5;
        int teamTreasure = captain;
        int sailorTreasure = teamTreasure/team;

        System.out.println("добыча владельца коробля - " + shopOwner);
        System.out.println("добыча капитана - " + (captain + sailorTreasure));
        System.out.println("оплата каждому человеку в команде в том числе капитану - " + sailorTreasure);
        System.out.println(shopOwner == treasure/2);
        System.out.println(captain == (treasure - shopOwner)/2);
        System.out.println(sailorTreasure == teamTreasure/team);
    }
}