import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        // теперь мы понимаем что это метод с именем мейн, который принимает параметр аргс,
        // и тип который этот метод возвращает он войд, он пустой.
        //метод мейн обязан быть статик и что бы он увидел другие методы они тоже должны быть статик

        int result;

      // int res2 = sum (1, 3);
      // int res3 = sum(1, sum(2, 2));

        //System.out.println(res3);

        int[][] arr = {{2,1},{6,7},{7,8,0}};

        min(arr);
        System.out.println(min(arr));

//        result = minAge(arr);

//        System.out.println("array " + Arrays.deepToString(arr) + "\n" + result);


        Person mary = new Person();
        mary.name = "Mary";
        mary.age = 55;

        Person.printMe(mary);

        Person jane = new Person();
        jane.name = "Jane";
        jane.age = 22;
        jane.mother = mary;
        System.out.println(jane.aboutMe());
        Person.printMe(jane);

        Person john; // переменная джон типа персон
        john = new Person (); // нев персон это место памети куда мы записываем новую переменную
        john.name = "John"; // у строки гораздо больше методов
        john.age = 23;
        john.mother = mary;
        System.out.println(john);
        System.out.println(john.name);
        System.out.println(john.aboutMe());
         //  john.printMe();

        Employee bob = new Employee();
        bob.name = "Andrey";
        bob.age = 20;
        bob.manager = mary;

        Person[] persons = {mary, jane, john};

        int minAge = Integer.MAX_VALUE;
        Person yongest = null;
        for (int i = 0; i < persons.length; i++) {

            if (minAge > persons[i].age) {
                yongest = persons[i];
                minAge = persons[i].age;
            }
        }
        System.out.println("youngest person is " + yongest.name);


        firstStep();
 }

    public int sum (int first, int second) {
        // возвращающийся тип может быть как примитивным как и референс типом, может быть и войд.
        int result = first + second;
        return result;
    }

    static int min (int [][] a){// метод может принимать в себя и отдавать любые массивы
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
               System.out.println(a[i][j] + " ");
                if (min > a[i][j]) {
                    min = a[i][j];
                }
            }
        }
        System.out.println(min);
        return min;
    }

    static int firstStep() {
        //здесь мы пишем тип значения которая возвращается методом, в данном случае void не возвращает ничего.
        // void ничего не будет возвращать, эта функция ничего не будет возвращать в то место кода в котором мы его вызываем
        // она просто выполнит свою функцию и уйдет в небытье, после чего программа продолжит компилировать

     //   int[] a = {5,6,7,8};
      //  int[] b = {5,6,7,8};
        int a [][] = {{2,1},{6,7},{7,8}};

        System.out.println(a); // выводит имя ячеqки места памяти
    //    System.out.println(b);
        System.out.println(Arrays.toString(a));

      //  a[0] = -1222;
        System.out.println(Arrays.toString(a));
      //  System.out.println(Arrays.toString(b));

        return 12;

    }
}
