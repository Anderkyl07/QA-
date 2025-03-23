public class Lessens3z11 {
    public static void main(String[] args) {

        int a = 5;

        //  if (a< 6 && a !=7) {
        //       System.out.println("true");
        //   }
        //   if (a==5 && a!= 6) {
        //      System.out.println("true");
        //   }
        if (a < 6) {
            System.out.println("true");
        } else if (a == 5) {
            System.out.println("true2");
        } else {
            System.out.println("False");
        }

        int b = 100;
        if (b > 10) ;
        {
            System.out.println("b>10");
        }
        if (b < 99) {
            System.out.println("b<99");
        }
        if (b / 2 > 20) {
            System.out.println("b/2>20");
        }
        if (b>5 && b<101) {
            System.out.println("b>5 && b<40");
        if (b < 5 || b > 40) {
                System.out.println("b<5||b>40");
            }
        }



        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 5 ; i=i*2) {
            System.out.println("i=" + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("j = " + j);
            }
        }
    }
}