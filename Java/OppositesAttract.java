public class OppositesAttract {

    public static boolean isLove(final int flower1, final int flower2) {

        return flower1 % 2 != flower2 % 2; // % оператор остатка от деления одного числа на другое
        // , тут мы написали остаток от фоловера 1 не равно остаток от фоловера 2
        }

    public static boolean isLove1(int flower1,int flower2) {
        if(flower1 % 2 != 0 && flower2 % 2 ==0 || flower1 % 2 == 0 && flower2 % 2 !=0) {
            return true;
        }

        return false;
    }
    public static String numberToString(int num) {
        System.out.println(Integer.toString(num));  // toString конвентирует цифры и числа из инта в стринг тип данных.
        return Integer.toString(num);

    }
    public class SmallestIntegerFinder {
        public static int findSmallestInt(int[] args) {
            return 0;
        }
    }
    static int min (int [] a){// метод может принимать в себя массив
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
                if (min > a[i]) {
                    min = a[i];
                }
            }
        System.out.println("min value = "+ min);
        return min;
    }

    public static int findSmallestInt(int[] args) { //условие ? выражениеПриИстине: выражениеПриЛожности.
        int smallest = Integer.MAX_VALUE;
        for (int i : args)
            smallest = (smallest>i) ? i : smallest;
        return smallest;
    }


    public static String countingSheep(int num) {
        if (num > 0) {
            System.out.println(num + " sheep..." + (num + 1) + " sheep..." + (num + 2) + " sheep...");
        } else {
            System.out.println("овца отрицательная");
        }
        return "num";
    }
}


