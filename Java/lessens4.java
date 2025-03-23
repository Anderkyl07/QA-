import java.lang.reflect.Array; // что бы использовать класс Arrey требуется его импортировать. Данная строка импортирует его. Жругие классы так же требуется импортировать.
import java.util.Arrays;

public class lessens4 {
    public static void main(String[] args) {

        double[] julyRides = new double[4];
        julyRides[0] = 15.0;
        julyRides[1] = 21.8;


        double[] julyRides1 = new double[]{15.0, 21.8, 20.5, 18.2};
        System.out.println(julyRides1);


        double[] julyRides2 = {15.0, 21.8, 20.5, 18.2};
        System.out.println(julyRides2);
        ;
        System.out.println(Arrays.toString(julyRides2));

        double total = 0;
        //Arreys - полезное заклинание которое позваляет распечатать содержимое массива
        for (int index = 0; index < julyRides2.length; index++) {
            System.out.println(julyRides2[index]);
        }
        for (int index2 = 0; index2 < julyRides1.length; index2++) {
            System.out.println(julyRides1[index2]); // квадратные скопки означают достать из масcива julyRides1  index2
            System.out.println(Arrays.toString(julyRides2));
        }
        System.out.println(Arrays.toString(julyRides2));

        System.out.println(julyRides2[1]);
        for (int index3 = 0; index3 < julyRides1.length; index3++) {
            System.out.println("inde3 = " + index3);
            System.out.println("ride length = " + julyRides1[index3]);
        }
        //length - это знчит взять свойство длинны у этого объекта. Без этого мы не сможем сравнить тип и массив, мы не можем сравнить ашку со скоростью света, или строку с вораном.
        for (int index4 = 0; index4 < julyRides1.length; index4++) {
            System.out.println("index4 = " + index4);
            System.out.println("ride length = " + julyRides1[index4]);
            total = total + julyRides1[index4];
        }
        System.out.println("Total in July: " + total);

        double[] jlyRides5 = {1, 2, 3, 4};
        System.out.println(jlyRides5.length);
        double[] jlyRides6 = new double[0];
        System.out.println(jlyRides6.length);

        double[] test = new double[15];
        for (int i = 0; i < test.length; i++) {
            System.out.println("test " + i);
        }
        System.out.println(test.length);
        double[] test2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println(Arrays.toString(test2));
        System.out.println(test2[14]);


        double[] test3 = new double[1113];
        test3[0] = 1;
        test3[1] = 2;
        test3[2] = 3;
        test3[3] = 4;
        test3[4] = 5;
        test3[5] = 6;
        test3[6] = 7;
        test3[7] = 8;
        test3[8] = 9;
        test3[9] = 10;
        test3[10] = 14;
        System.out.println(Arrays.toString(test3));
        System.out.println(test3[9]);
        System.out.println(test3.length);


        double[] test4 = new double[0];
        System.out.println(test4.length);


        double[] test5 = {};
        System.out.println(test5.length);

        double[] test6 = new double[15];
        System.out.println(test6.length);

        System.out.println(Arrays.toString(test6));

        double[] test7 = new double[1];
        System.out.println(test7.length);
        System.out.println(Arrays.toString(test7));


        double[] test8 = new double[87];
        System.out.println(test8.length);
        System.out.println(Arrays.toString(test8));


        int a;
        a = 0;

        double[] augustRides1 = new double[7];
        augustRides1[0] = 22.0;
        augustRides1[1] = 25.9;
        System.out.println(Arrays.toString(augustRides1));
        augustRides1[2] = 26.8;
        augustRides1[3] = 22.8;
        augustRides1[4] = 22.8;
        System.out.println(Arrays.toString(augustRides1));
        augustRides1[5] = 24.8;
        augustRides1[6] = 30.5;
        System.out.println(Arrays.toString(augustRides1));


        double[] augustRides = new double[6];
        augustRides[0] = 25.6;
        augustRides[1] = 25.9;
        augustRides[2] = 26.8;
        augustRides[3] = 22.8;
        augustRides[4] = 24.8;
        augustRides[5] = 30.5;

        double min = augustRides[0];
        double max = Double.MAX_VALUE;
        double Min = Double.MIN_VALUE;
        double max4 = Double.MIN_VALUE;

        for (int index = 0; index < augustRides.length; index = index + 1) {
            if (augustRides[index] < min) {
                min = augustRides[index];
            }
        }
        for (int index = 0; index < augustRides.length; index = index + 1) {
            if (augustRides[index] > max4) {
                max4 = augustRides[index];
            }
        }
        for (int index = 0; index < augustRides.length; index = index + 1) {
            if (augustRides[index] < Min) {
                Min = augustRides[index];
            }
        }

        System.out.println("Shortest ride was = " + min);
        System.out.println("Longest ride was = " + max4);
        System.out.println("Shortest ride was = " + Min);

        double[][] allRides = {
                {25.0, 21.0, 20.5, 18.2},
                {22.8, 25.6, 25.9, 30.5, 24.8, 26.8}
        };
        System.out.println(Arrays.toString(allRides[0]));
        System.out.println(Arrays.toString(allRides[1]));

        System.out.println(allRides[0][3]);
        System.out.println(allRides[1][4]);
        System.out.println(allRides.length);


        double max2 = Double.MIN_VALUE;
        for (int i = 0; i < allRides.length; i = i + 1) {
            for (int j = 0; j < allRides[i].length; j = j + 1) {
                if (allRides[i][j] > max2) {
                    max2 = allRides[i][j];
                }
            }
        }
        System.out.println("The longest ride ever was " + max);

        double max3 = Double.MIN_VALUE;
        for (double[] innerArray : allRides) {     // : - создает перебор каждого элемента массива.

            for (double ride : innerArray) {
                if (ride > max) {
                    max = ride;
                }
            }
        }
        int[] ints = {1, 2, 3, 4, 17};
        for (int i : ints) {
            System.out.println(i);
        }

        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}