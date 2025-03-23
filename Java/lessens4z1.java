import java.util.Arrays;

public class lessens4z1 {
    public static void main(String[] args) {
        //double[] julyrides = new double[4];
        //julyrides[0] = 1;
        //julyrides[1] = 2;
        //julyrides[2]= 3;
        //julyrides[3] = 4;


        //double [] julyrides = new double [] {0, 21.8, 20.5, 18.9};


        double[] julyrides = {15.0, 21.8, 20.5, 18.2};

        // три разных способа создават массивы

        System.out.println(julyrides); // тут напечатается уникальный индитификатор этого массива

        System.out.println(Arrays.toString(julyrides)); // тут распечатается весь массив

//index++ = index = index + 1
        double total = 0;
        for (int index = 0; index < julyrides.length; index++) {     //length - ,без него программа не Поймет как сравнивать индекс с массивом, невозможно сравнить тарелки с балконом\\
            //    System.out.println(julyrides[index]); // тут квадратные с копки означают "достать из массива выбраны в данной итерации индекс"
            //   total = total + julyrides.length;
            System.out.println("index = " + index);
            System.out.println("Ride length = " + julyrides[index]);
            total = total + julyrides[index];
            System.out.println("Total so far " + total);
            //  System.out.println(julyrides.length);
        }
        System.out.println("Total in July: " + total);


        String A[] = new String[15];
        System.out.println(Arrays.toString(A));


        double[] augustRides = {25.6, 25.9, 26.8, 22.8, 24.8, 30.5};

        //double min = augustRides[0];
        //double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (int index = 0; index < augustRides.length; index++) {
            if (augustRides[index] > max) {
                max = augustRides[index];
            }
        }
        System.out.println(max);

        //    это создает тип массива double a = это создает количество элементов массива new double [6];


        double[][] allRides ={
                {15.0, 21.8, 20.5, 18.2},
                {25.6, 25.9, 26.8, 22.8, 24.8, 30.5}
    };

        System.out.println(allRides[2].length);
        System.out.println(allRides.length);
        System.out.println(Arrays.toString(allRides[0]));
        System.out.println(Arrays.toString(allRides[1]));
        System.out.println((allRides[0][1]));
        System.out.println((allRides[1][3]));


        for (int index = 0; index < allRides.length; index++) {
            System.out.println(allRides.length);
            System.out.println(Arrays.toString(allRides));
            System.out.println(Arrays.toString(allRides[index]));
        }


double max2 = Double.MIN_VALUE;
        for (int i = 0; i < allRides.length; i++) {
            for (int j = 0; j < allRides[i].length; j++) {
                if (allRides[i][j]>max2){    // здесь мы говорим взять из масива взять нулевой элемент и из него взять нулевой элемент , это у насс 15.  15 больше чем самое аленькое число возможное, больше заначит далее мы приравниваем это число к max.
                    max2 = allRides[i][j];
                }
            }
        }
        System.out.println(max2);

        double max3 =Double.MIN_VALUE;
        for (int i = 0; i < allRides.length; i++) {
            double[] innerArray = allRides[i];                  // тут просто прировняли новый массив innerArray к allRides[i]

            for (int j = 0; j < innerArray.length; j++) {
                if (innerArray[j] > max) {
                    max3 = innerArray[j];
                }
            }
        }
        System.out.println(max3);




        int[] ints= {1,2,3,4};
         for (int i : ints) {     // здесь мы говорим перебрать все переменный массив ints и каждый раз присваивать ее переменные к переменной i. Это сокращенная форма записи которая тоже работает.
             System.out.println(i);
         }


        double max4 =Double.MIN_VALUE;
        for (double[] innerArray :  allRides) {

            for (double ride : innerArray) {
                if  (ride > max4) {
                    max4 = ride;
                    System.out.println(max4);
                }
            }
        }
        System.out.println(max4);
    }
}
