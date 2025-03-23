import java.util.Arrays;

public class Main {

    Test[] test;
    public static void main(String[] args){


Test.sum(1,2);
Test.div(4,2);
Test.mult(3,3);
Test.sub(4,5);

Test.sum2(3,3);

Test value1 = new Test();
value1.name = "Test1";
value1.value = 5;
value1.sum3(3,4);

Test x = Test.newValue("x", 5);
        System.out.println(x.name);

Test[] biblioteka = {x};
        System.out.println(biblioteka);
        System.out.println(Arrays.toString(biblioteka));

    }
}