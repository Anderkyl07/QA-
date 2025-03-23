import java.util.Arrays;

public class lessens5 {
    public static void main(String[] args) {
//        for(int i = 0;i<5;i=i+1) {
//            System.out.println(i);
//        }


        int a = 10;
        int b = a;

        a = 0;

        System.out.println(b);
        System.out.println(a);

        int[] arr1 = {1, 2, 3, 4};

        int[] arr2 = arr1;
        int[] arr3 = arr2;
        arr2[0] = -1;
        arr2[3] = -4;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


        int[] arr4 = {1, 2, 3, 4};

        System.out.println(arr4.length);    // это атрибут массива, и к атрибутам можно обращаться через точку "."


        String str = "Hello world";

        System.out.println(str.contains("Hello world")); // contains помогает найти значение которое мы задали в скобке
        System.out.println(str.contains("sergey"));

        System.out.println(str.indexOf("world")); //поиск с какого символа начинается слово которое мы задали

        System.out.println(str.charAt(0)); //возвращает символ по индексу

        for (int i = 0; i < str.length(); i = i + 1) {
            System.out.println(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'w') {             // char в jave выделяется одиночными ковычками.
                System.out.println("index of w id " + i);

            }
        }


        System.out.println(str.indexOf('w'));
        System.out.println(str.indexOf('s'));
        System.out.println(str.toUpperCase()); // возвращает все значения с верхним регистром
        System.out.println(str.toLowerCase()); // возвращает все значения с нижним регистром
        System.out.println(str); //эти методы не модифицируют старую строку, а создают новую
        // мы не можем создав новую строку ее изменить.


        System.out.println(str.indexOf('w')); // w это АРГУМЕНТ, а indexOf это МЕТОД.

        System.out.println(str.replace('l', '-'));// этот метод позволяет менять один аргумент на другой

        String str2 = str.replaceFirst("Hello", "*");

        System.out.println(str);
        System.out.println(str2);

        System.out.println(str.lastIndexOf('l')); // найти последний аргумент
        System.out.println(str.lastIndexOf('l', 2));//найди аргумент с заданного символа


        int[] arr5 = {1};
        System.out.println(arr5); // вывод адреса в памяти


        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i)=='l') {
//                count++;// каждый раз когда в цикле будет аргумент l, к count будет прибавляться 1, таким образом мы посчитаем все буквы l
//            }
//        }
//        System.out.println(count);


        String[] str3 = {"Hello", "world", "!"};

        for (int i = 0; i < str3.length; i++) {
            for (int j = 0; j < str3[i].length(); j++) {
                if (str3[i].charAt(j) == 'l') {
                    count++;
                }
            }
        }
        System.out.println(count);


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i >= 3 && i <= 6 && j >= 3 && j <= 6) {
                    System.out.print(" 0");
                } else {
                    System.out.print(" '");
                }
            }
            System.out.println();
        }


        int[][] arr6 = {{2,4},{6,8},{10,12}};

        for (int i = 0; i < arr6.length; i++) {
            for (int j = 0; j <arr6[i].length ; j++) {
                System.out.println(arr6[i][j]);
            }
        }

int [][][] arr7 = {{{1,1,1},{2,2,2}},{{3,3,3},{4,4,4}},{{5,5,5},{6,6,6}}};

        System.out.println(arr7);
        System.out.println(Arrays.toString(arr7));
        System.out.println(Arrays.deepToString(arr7));//выводит весь массив какой бы он не был



//int[][] l = {{1,2,3},{4,5,6,7}};
//        for (int i = 0; i < l.length; i++) {
//            for (int j = 0; j < l[i].length; j++) {
//                System.out.println(l[i][j]);
//            }
//        }



      //  for(/* инициализация переменно ; проверяет условие работы цикла; */)


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i==5){
                break;   // условие которое прерывает программу.
            }
        }


        for (int i = 0; i < 10; i++) {
            if(i==5){
                break;   // условие которое прерывает программу.прерывает весь цикл целиком
            }
            System.out.println(i);
        }


String str7 = "Hello World!";

        boolean isL = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                isL = true;
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i==5||i==8){
                continue;    // этот оператор прерывает итерацию.
            }
            System.out.println(i);
        }




        int f = 0;
        while (f<5){                   // еще два цикла, если цик возвращает true , то цик крутится, если возвращает false то цикл востанавливается
            System.out.println(f);
f++;
        }



        int c =0;
        do {                               //тоже самое но имеет постусловие, сначала выполнится условие, а потом проверяется условие
            System.out.println(c);
            c++;
        }while (c<5);



        String str8 = "Hello world";
        while(str8.length()>5) {
            str8 = str8.substring(0,str8.length()-3);
        }
        System.out.println(str8);



    }
}
