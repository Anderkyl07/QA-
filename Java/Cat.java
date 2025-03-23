public class Cat {//классы тоже могут быть паблик и приват
    public static void catName(){// паблик доступен везде и всюду, прайвед только в том классе в котором он был создан.
        System.out.println("Барсик");
    }
    private static void catAge(int a){//приват используется только внутри того класса в котором был создан
        System.out.println(a);
    }
    public static void catFood(){
        System.out.println("Вискас");
    }

    public static void main(String[] args) {
        Cat.catAge(7);

    }
}

