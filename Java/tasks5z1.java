import java.util.Arrays;

public class tasks5z1 {
    public static void main(String[] args) {

        //Задачи 5.1
        //задача 1
        int[] a = {9, 2, 6, 4, 5, 12, 7, 8, 6};


        int sum = 0;
        for (int i = 0; i < a.length; i = i + 1) {
            System.out.print(" " + a[i]);
            sum = sum + a[i];
            sum += a[i];

        }
        System.out.println(sum);


//Задача 2


        int[] b = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < b.length; i = i + 1) {
            if (max < b[i]) {
                max = b[i];
            }
        }
        System.out.println(max);


        //Задача 3

        int[] c = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < c.length; i++) {
            if (min > c[i]) {
                min = c[i];
            }
        }
        System.out.println(min);


        //Задача 4

        int[] d = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int length = d.length;
        int sum2 = 0;

        for (int i = 0; i < d.length; i++) {
            sum2 = sum2 + d[i];
        }
        System.out.println(sum2 / length);


        //Задача 5

        int[][] f = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        System.out.println(Arrays.deepToString(f));
        System.out.println(f[3][0]);
        System.out.println(f.length);
        System.out.println(f);
        System.out.println(f[0]);
        System.out.println(f[1].length);

        int sum3 = 0;
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                sum3 = sum3 + f[i][j];
            }
            System.out.println(sum3);
        }
        System.out.println(sum3);


//Задача 5

        int[][] e = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                if (max2 < e[i][j]) {
                    max2 = e[i][j];
                }
            }
        }
        System.out.println(max2);


        //Задача 6

        int[][] r = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                if (max3 < r[i][j]) {
                    max3 = r[i][j];
                }
            }
        }
        System.out.println(max3);


        int[][] y = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int count = 0;
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                count++;
            }
        }
        System.out.println(count);


//Задачи 5.2
// Задача 1
        String s = "Перестановочный алгоритм быстрого действия";
        System.out.println(s.charAt(0));

        System.out.println(s.contains(" алгоритм"));

        for (int i = 0; i < s.length(); i++) {
            //System.out.println(s.length());
            //System.out.print(" " + i);
            // System.out.print(" " + s.charAt(i));
            if (s.charAt(i) == 'о') {
                //  System.out.println("Индекс буквы 'о' " + i);
                System.out.print(s.charAt(i));
            }
        }


        // Задача 2
        String s2 = "Перевыборы выбранного президента";


        int count2 = 0;

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'е') {
                count2++;
            }
        }
        System.out.println(count2);

        //Задача 3

        String s3 = "Посмотрите как Рите нравится ритм";

        for (int i = 0; i < s3.length(); i++) {
            // System.out.println(s.charAt(i));
            if (s3.charAt(i) == 'р' || s3.charAt(i) == 'и' || s3.charAt(i) == 'т') {
                System.out.print(" " + i);
                System.out.println(s3.charAt(i));
            }
        }

//            for (int i = 0; i < s3.length(); i++) {
//                // System.out.println(s.charAt(i));
//                if (s3.contains("рит")) {
//                    System.out.print(" " + i);
//                    System.out.println(s3.charAt(i));
//                }
//            }
//        }

//  Задача 5.3
// Задача 1
//        for (int i = 0; i < 1; i = i + 1) {
//            System.out.println(" " + i);
//            for (int j = 0; j < 2; j++) {
//                System.out.print(" " + j);
//                if (j == 1) {
//                    System.out.println();
//                }
//            }
//            for (int j = 0; j < 3; j++) {
//                System.out.print(" " + j);
//                if (j == 2) {
//                    System.out.println();
//                }
//            }
//            for (int j = 0; j < 4; j++) {
//                System.out.print(" " + j);
//                if (j == 3) {
//                    System.out.println();
//                }
//            }
//            for (int j = 0; j < 5; j++) {
//                System.out.print(" " + j);
//                if (j == 4) {
//                    System.out.println();
//                }
//            }
//            for (int j = 0; j < 6; j++) {
//                System.out.print(" " + j);
//                if (j == 5) {
//                    System.out.println();
//                }
//            }
//            for (int j = 0; j < 7; j++) {
//                System.out.print(" " + j);
//                if (j == 6) {
//                    System.out.println();
//                }
//            }
//            for (int j = 0; j < 8; j++) {
//                System.out.print(" " + j);
//                if (j == 7) {
//                    System.out.println();
//                }
//            }
//            for (int j = 0; j < 9; j++) {
//                System.out.print(" " + j);
//
//                if (j == 8) {
//                    System.out.println();
//                }
//            }
//            for (int j = 0; j < 10; j++) {
//                System.out.print(" " + j);
//                if (j == 9) {
//                    System.out.println();
//                }
//            }
//        }

//        //Задачи 2
//

            for (int j = 0; j < 10; j++) {
                System.out.print(" " + j);
                if (j == 9) {
                    System.out.println();
                }
            }
            for (int j = 0; j < 9; j++) {
                System.out.print(" " + j);
                if (j == 8) {
                    System.out.println();
                }
            }
            for (int j = 0; j < 8; j++) {
                System.out.print(" " + j);
                if (j == 7) {
                    System.out.println();
                }
            }
            for (int j = 0; j < 7; j++) {
                System.out.print(" " + j);
                if (j == 6) {
                    System.out.println();
                }
            }
            for (int j = 0; j < 6; j++) {
                System.out.print(" " + j);
                if (j == 5) {
                    System.out.println();
                }
            }
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + j);
                if (j == 4) {
                    System.out.println();
                }
            }
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + j);
                if (j == 3) {
                    System.out.println();
                }
            }
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + j);
                if (j == 2) {
                    System.out.println();
                }
            }
            for (int j = 0; j < 2; j++) {
                System.out.print(" " + j);
                if (j == 1) {
                    System.out.println();
                }
            }
            for (int j = 0; j < 1; j++) {
                System.out.print(" " + j);
                if (j == 0) {
                    System.out.println();
                }
            }




        for (int j = 0; j < 10; j++) {
            System.out.print(" " + j);
            if (j == 9) {
                System.out.println();
            }
        }
        for (int j = 0; j < 10; j++) {
            if (j == 0) {
                System.out.print("  ");
            } else {
                System.out.print(" " + j);
            }
            if (j == 9) {
                System.out.println();
            }
        }
        for (int j = 0; j < 10; j++) {
            if ((j == 0) || (j == 1)) {
                System.out.print("  ");
            } else {
                System.out.print(" " + j);
            }
            if (j == 9) {
                System.out.println();
            }
        }
        for (int j = 0; j < 10; j++) {
            if ((j == 0) || (j == 1) || (j == 2)) {
                System.out.print("  ");
            } else {
                System.out.print(" " + j);
            }
            if (j == 9) {
                System.out.println();
            }
        }
        for (int j = 0; j < 10; j++) {
            if ((j == 0) || (j == 1) || (j == 2) || (j == 3)) {
                System.out.print("  ");
            } else {
                System.out.print(" " + j);
            }
            if (j == 9) {
                System.out.println();
            }
        }
        for (int j = 0; j < 10; j++) {
            if ((j == 0) || (j == 1) || (j == 2) || (j == 3) || (j == 4)) {
                System.out.print("  ");
            } else {
                System.out.print(" " + j);
            }
            if (j == 9) {
                System.out.println();
            }
        }
        for (int j = 0; j < 10; j++) {
            if ((j == 0) || (j == 1) || (j == 2) || (j == 3) || (j == 4) || (j == 5)) {
                System.out.print("  ");
            } else {
                System.out.print(" " + j);
            }
            if (j == 9) {
                System.out.println();
            }
        }
        for (int j = 0; j < 10; j++) {
            if ((j == 0) || (j == 1) || (j == 2) || (j == 3)|| (j == 4) || (j == 5) || (j == 6)) {
                System.out.print("  ");
            } else {
                System.out.print(" " + j);
            }
            if (j == 9) {
                System.out.println();
            }
        }
        for (int j = 0; j < 10; j++) {
            if ((j == 0) || (j == 1) || (j == 2) || (j == 3) || (j == 4) || (j == 5) || (j == 6) || (j == 7)) {
                System.out.print("  ");
            } else {
                System.out.print(" " + j);
            }
            if (j == 9) {
                System.out.println();
            }
        }
        for (int j = 0; j < 10; j++) {
            if ((j == 0) || (j == 1) || (j == 2) || (j == 3) || (j == 4) || (j == 5) || (j == 6) || (j == 7) || (j == 8)) {
                System.out.print("  ");
            } else {
                System.out.print(" " + j);
            }
            if (j == 9) {
                System.out.println();
            }
        }


        //Задача 3


        for (int i = 9; i > -1; i--) {
            System.out.print(" " + i);
        }
        for (int i = 1; i < 10; i++) {
            System.out.print(" " + i);

            if (i == 9) {
                System.out.println();
            }
        }

        for (int i = 9; i > -1; i--) {
            if (i == 9) {
                System.out.print(" " + "-");
            } else {
                System.out.print(" " + i);
            }
        }
        for (int i = 1; i < 10; i++) {
            if (i == 9) {
                System.out.print(" " + "-");
            } else {
                System.out.print(" " + i);
            }
        }

        System.out.println();
        for (int i = 9; i > -1; i--) {
            if ((i == 9) || (i == 8)) {
                System.out.print(" " + "-");
            } else {
                System.out.print(" " + i);
            }
        }
        for (int i = 1; i < 10; i++) {
            if ((i == 9) || (i == 8)) {
                System.out.print(" " + "-");
            } else {
                System.out.print(" " + i);
            }
        }

        System.out.println();
        for (int i = 9; i > -1; i--) {
            if ((i == 9) || (i == 8) || (i == 7)) {
                System.out.print(" " + "-");
            } else {
                System.out.print(" " + i);
            }
        }
        for (int i = 1; i < 10; i++) {
            if ((i == 9) || (i == 8) || (i == 7)) {
                System.out.print(" " + "-");
            } else {
                System.out.print(" " + i);
            }
        }

        System.out.println();
        for (int i = 9; i > -1; i--) {
            if ((i == 9) || (i == 8) || (i == 7) || (i == 6)) {
                System.out.print(" " + "-");
            } else {
                System.out.print(" " + i);
            }
        }
        for (int i = 1; i < 10; i++) {
            if ((i == 9) || (i == 8) || (i == 7) || (i == 6)) {
                System.out.print(" " + "-");
            } else {
                System.out.print(" " + i);
            }
        }

        System.out.println();
        for (int i = 9; i > -1; i--) {
            if ((i == 9) || (i == 8) || (i == 7) || (i == 6) || (i == 5)) {
                System.out.print(" " + "-");
            } else {
                System.out.print(" " + i);
            }
        }
        for (int i = 1; i < 10; i++) {
            if ((i == 9) || (i == 8) || (i == 7) || (i == 6) || (i == 5)) {
                System.out.print(" " + "-");
            } else {
                System.out.print(" " + i);
            }
        }
        System.out.println();

        for (int i = 9; i > -1; i--) {
            if ((i == 9) || (i == 8) || (i == 7) || (i == 6) || (i == 5) || (i == 4)) {
                System.out.print(" " + "-");
            } else {
                System.out.print(" " + i);
            }
        }
        for (int i = 1; i < 10; i++) {
            if ((i == 9) || (i == 8) || (i == 7) || (i == 6) || (i == 5) || (i == 4)) {
                System.out.print(" " + "-");
            } else {
                System.out.print(" " + i);
            }
        }
        System.out.println();

        for (int i = 9; i > -1; i--) {
            if ((i == 9) || (i == 8) || (i == 7) || (i == 6) || (i == 5) || (i == 4) || (i == 3)) {
                System.out.print(" " + "-");
            } else {
                System.out.print(" " + i);
            }
        }
        for (int i = 1; i < 10; i++) {
            if ((i == 9) || (i == 8) || (i == 7) || (i == 6) || (i == 5) || (i == 4) || (i == 3)) {
                System.out.print(" " + "-");
            } else {
                System.out.print(" " + i);
            }
        }
        System.out.println();

        for (int i = 9; i > -1; i--) {
            if ((i == 9) || (i == 8) || (i == 7) || (i == 6) || (i == 5) || (i == 4) || (i == 3) || (i == 2)) {
                System.out.print(" " + "-");
            } else {
                System.out.print(" " + i);
            }
        }
        for (int i = 1; i < 10; i++) {
            if ((i == 9) || (i == 8) || (i == 7) || (i == 6) || (i == 5) || (i == 4) || (i == 3) || (i == 2)) {
                System.out.print(" " + "-");
            } else {
                System.out.print(" " + i);
            }
        }
        System.out.println();

        for (int i = 9; i > -1; i--) {
            if ((i == 9) || (i == 8) || (i == 7) || (i == 6) || (i == 5) || (i == 4) || (i == 3) || (i == 2) || (i == 1)) {
                System.out.print(" " + "-");
            } else {
                System.out.print(" " + i);
            }
        }
        for (int i = 1; i < 10; i++) {
            if ((i == 9) || (i == 8) || (i == 7) || (i == 6) || (i == 5) || (i == 4) || (i == 3) || (i == 2) || (i == 1)) {
                System.out.print(" " + "-");
            } else {
                System.out.print(" " + i);
            }
        }
        System.out.println();


        for (int i = 10; i-- > 0; ) {
            for (int j = 0; j < 9 - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (j >= i) {
                    System.out.print((j) + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }



            int o = 0;
        while (o < 5) { // при while сначала проверяется условие. потом выполняется.
            o++;
            System.out.println(o);
        }

        int t = 0;
        do {t++; // при do сначала выполняется действие, после проверяется условие
            System.out.println(t);
        } while (t<10);
    }
}
