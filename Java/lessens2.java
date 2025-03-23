public class lessens2 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println(2 + 2);
        int x = 12;
        int y = 15;
//----------------------------------------------------------
        System.out.println(27);
        System.out.println(x + y);


        //--------------------------------------------------------
        int summa1 = 100 * 4 + 20 * 8 + 2 * 40 + 1 * 400;
        System.out.println(summa1);
        int summa2 = 75 * 4 + 10 * 8 + 2 * 40 + 1 * 400;
        System.out.println(summa2);

        int reguler = 120;
        int doppel = 25;
        int archers = 30;
        int leut = 2;
        int captain = 1;
        int baseSalary = 6;

        int summa = reguler * baseSalary +
                (archers + doppel) * 2 * baseSalary +
                leut * 10 * baseSalary +
                captain * 100 * baseSalary;

        System.out.println(summa);

        int age = 70;
        //-----------------------------------
        //еще столько, да полстолько, да четверть столько
        System.out.println(age + age/2 + age/4);//age +1.75

        System.out.println(age * 1.75);//age +1.75

        double yearsMoreToLive = 122.5;
        System.out.println(yearsMoreToLive/1.75);

        //double и float два типа данных которые работают с дробными числами.

        System.out.println(11 / 2);
        System.out.println(11 / 2.0);

        float q = 122.4f;
        long i = 10L;


        int hex = 0x50;
        System.out.println(hex);

        long chislo = 10l;


        int x2 = 14;

        long x3 = 14l;

        byte a = 127;

        byte b = 122;


        int result = a+b;
        System.out.println(a+b);
        System.out.println(result);


        System.out.println(11/2);

        System.out.println(5%2);


        char c = 80;
        System.out.println(c);
        //ASCII
char s = 100;
char v = 'd';

        String h = "Hello world!";
        System.out.println(h);
        System.out.println(s == v);
        System.out.println(s);


        char letterD = 'd';

        char result1 = (char) (letterD +1);
        System.out.println(result1);


        boolean meBool = true;
        boolean myBool1 = false;


        String hello = "Hello world!";

        System.out.println("Hello world!");
        System.out.println(hello);
        String Hello = "Hello";
        String world = "World";
        System.out.println(Hello + world);


        System.out.println(1 + 2 + "a");
        System.out.println("b" + 1 + 2);


        System.out.println("" + 1 + 2 + "a");
        System.out.println("b" + (1 + 2));

        System.out.println(-11 / 2);
        System.out.println(-11.0 / 2);

        int f = 27;
        int g = 4;
        System.out.println(f * 1.0 / g);
        System.out.println((double)a/b);


    }
}
