public class Employee {

    String Name;
    double baseSalary;
    double check;

    public void getBaseSalary(){// получить базовую ставку
        check = check + baseSalary;
        System.out.println(check);
    }
    public  void BaseSalary(){//показать базовую зарплату
        System.out.println(baseSalary);
    }

    public void minusSetBaseSalaryy (double summa){//отнимает от базовой ставки
        if (baseSalary < summa ) {
            System.out.println("нет возможности понизить ставку на - " + summa + "\n" + "ставка равняется = " + baseSalary);
        } else {
            baseSalary = baseSalary - summa;
        }
    }

    public void plusSetBaseSalary (double summa){//прибавляет от базовой ставки
            baseSalary = baseSalary + summa;
        }

    public void getName(){// отдает имя
        System.out.println(Name);
    }

    public void setName(String Names){//метод меняющий имя
        Name = Names;
    }
}


//Задача №1
//
//Необходимо создать класс Employee со следующими методами:
//getBaseSalary - получить базовую ставку
//setBaseSalary - изменить базовую ставку
//getName - получить имя
//setName - изменить имя
//getSalary - получить зарплату
