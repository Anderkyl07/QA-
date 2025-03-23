public class lessen3z1 {
    public static void main(String[] args) {
        int a = 110;
        int b = 5;

        System.out.println(a + b);
        {
            int x = 10;
            System.out.println(a);
        }
        if (a >= 100) {
            int x = 10;
            System.out.println("a less then 100");
        }
        //&& - амперсент "и"
        //|| - оператор "или"
        //== - проверка равенства
        //!= - проверка неравенства
        //else - позволяет выбрать, какие из двух п
        //путей кода следует выполнять на основе логического выражения
        //for - позволяет выполнить действие несолько раз пока не выполнится условие

        boolean t = false;
        boolean f = true;
        if ((a > 100 && b < 50) || (a < 1000 && b > 20)) {
            System.out.println("!!!!!!");
        }
        //  System.out.println(x);
        if (a != 0) {
            System.out.println("!!!!!!");
        }
        if (a == 0) {
            System.out.println("!!!!!!");
        }
        if (a == 110) {
            System.out.println("a = 110");
        } else {
            System.out.println("a! = 110");
        }
        if (a == 110) {
            System.out.println("a = 110");
            if (a < 55)
            System.out.println("a<55");
        }
        if (a < 110) {
            System.out.println("a < 110");
        }else {
            System.out.println("!!!");
        }
        if (a<110) {
            System.out.println("a < 110");
            System.out.println(("!!!"));
        }
        int j =0;
        System.out.println(j);
        j = j+1;
        System.out.println(j);

        for (int i = 0;i < 5;i = i + 1) {
            System.out.println("hI");
            System.out.println(i);
        }
        for (int i = 0;i < 25;i = i + 5) {
            System.out.println("hI");
            System.out.println(i);
        }
        for (int i = 0;i < 25;i = i + 1) {
            System.out.println("hI");
            System.out.println(i);
        }
        for (int i = 0;i < 25;i = i + 1) {
            for (int c = 0;c < 6;c = c + 1) {
                System.out.println("Hi");
                System.out.println(i);
                System.out.println(c);
            }
        }
        for (int i = 0;i < 25;i = i + 1)
            System.out.println(i);
    }
    int i = 10;
}
