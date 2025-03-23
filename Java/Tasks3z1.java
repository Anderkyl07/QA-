public class Tasks3z1 {
    public static void main(String[] args) {

        int a = 100;
        int b = 2;
        System.out.println(a == b);
        System.out.println(a < b);
        System.out.println(a > b);


        int c = 1000;

        if (a < c) {
            System.out.println("переменная а меньше с");
        } else {
            System.out.println("test не эффективны");
        }
        if (a > c || a == c) {
            System.out.println("все верно");
        } else {
            System.out.println("все не верно");
        }
        if (a < c && a != c) {
            System.out.println("все верно");
        } else {
            System.out.println("все плохо");
        }

        for (int i = 10; i < 101; i = i + 10) {
            System.out.println(i);
        }

        for (int i = 1; i < 100; i = i + 1) {
            for (int j = 1; j < 100; j = j + 1) {
                System.out.println(i);
                System.out.println(j);
            }
        }
        int d = 1000;
        if (d > 10) {
            System.out.println("переменная больше 10");
        }

        int s = 99;
        if (s < 100) {
            System.out.println("переменная меньше 100");
        }

        int q = 1000;
        int o = q / 2;
        if (o > 20) {
            System.out.println("переменная больше 20");
        }
        int f = 6;
        if (f > 5 && f < 40) {
            System.out.println("значение больше 5 и меньше 40");
        }
        int e = 47;
        if (e < 5 || e > 40) {
            System.out.println("значение меньше 5 или  больше 40");

        }
    }
}