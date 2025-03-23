public class Test {

    String name;
    Integer value;


    Test[] test;


    static int sum (int a , int b ){

        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    static int sub (int a , int b ){

        int sub = a - b;
        System.out.println(sub);
        return sub;
    }

    static int mult (int a , int b ){
        int mult = a * b;
        System.out.println(mult);
        return mult;
    }
    static int div (int a , int b ){

        int div = a / b;
        System.out.println(div);
        return div;
    }

    static void sum2(int a, int b){
        System.out.println(a + b);

    }

    int sum3(int a, int b){
        int sum = a + b;
        System.out.println(a + b);
        return sum;
    }

    static Test newValue (String name,Integer value){
        Test x = new Test();
        x.name = name;
        x.value = value;
        System.out.println();
        return x;
    }



}
