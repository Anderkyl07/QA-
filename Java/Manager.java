import jdk.dynalink.beans.StaticClass;

import java.sql.Statement;
import java.util.Arrays;

public class Manager {

    static Worker newBaseSalary(double baseSalary) {
        Worker worker = new Worker();
        worker.baseSalary = baseSalary;
        return worker;
    }

    public static Office[] returnArray() {
        System.out.println(office.workers.length);
        return new Office[0];
    }


    public static void main(String[] args) {
        Worker Andrey = new Worker();
        Andrey.baseSalary = 1000;
        Andrey.getSalary();


        Worker Olga = Manager.newBaseSalary(1000);
        Olga.getSalary();

        Office office = new Office();
        office.workers = new Worker[]{Olga,Andrey};

        System.out.println(office);
        System.out.println(office.workers.length);
        System.out.println(Arrays.toString(office.workers));



    }
}


//Задача №2
//
//Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.
//
//Необходимо создать класс Manager в который нужно добавить следующие методы:
//getNumberOfSubordinates - получить количество подчиненных
//        setNumberOfSubordinates - установить количество подчиненных
//
//        в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3). Если количество подчиненных 0, то результат как у обычного рабочего.
//
//Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0, то результат как у обычного рабочего.




