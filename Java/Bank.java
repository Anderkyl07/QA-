public class Bank {

    public static void main(String[] args) {

        Account checking = new Account();// объявляем переменную checking, потом говорим
        // создать новый экземпляр, и для этого экземпляра отвести место в классе Account
        // в этой строке скрыто три разных действия,1 - мы объявляем переменную чекинг,
        // 2 - то что слева , его надо к чему то присвоить, он смотрит на право и видит что
        // можно создать по чертежу account.
        //3 - записать созданный экземпляр в созданную переменную.
        // то есть три действия,
        // 1 - объявить переменную,
        // 2 - создать новый экземпляр acсount,
        // 3 - и записать созданный экземпляр в созданную переменную
        // скобки нужна, что бы принять какие-то параметры, Account не принимает какие-то параметры.
        checking.balance = 0;

        //checking.balance += 100;
checking.plus(100);
        System.out.println(checking.balance);


        checking.debit(20);
        System.out.println(checking.balance);


        //checking.balance -= 200;
checking.debit(170); //этот способ удобнее так как мы запускаем метод.

        System.out.println(checking.balance);


        Account saving = new Account();
        saving.balance = 1000;

        checking.debit(200);
        System.out.println("Checking balance " + checking.balance);

        saving.debit(200);
        System.out.println("Saving balance: " + saving.balance);



    }
}
