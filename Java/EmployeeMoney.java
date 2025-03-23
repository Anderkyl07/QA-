
public class EmployeeMoney {
    public static void main(String[] args) {

        Employee one = EmployeeMoney.newBaseSalary("Andrey",18000,0);
        Employee two = EmployeeMoney.newBaseSalary("Andrey",18000, 0);

        one.getName();

        one.setName("Андрей");

        one.getName();

        one.getBaseSalary();

        one.BaseSalary();

        one.minusSetBaseSalaryy(1000);

        one.BaseSalary();

        one.plusSetBaseSalary(2000);

        one.BaseSalary();

        one.minusSetBaseSalaryy(20000);

    }


    static Employee newBaseSalary(String Name, double baseSalary,double check) {
        Employee employee = new Employee();
        employee.Name = Name;
        employee.baseSalary = baseSalary;
        employee.check = check;
        return employee;
    }

//    public void printSalary() {
//        for (EmployeeMoney employeeMoney : employeeMonies) {
//            System.out.println(employeeMoney.makeSalary());
//        }
//
//        EmployeeMoney andrey = Employee.newBaseSalary(0);
//
//    }
}
