public class LibMain {

    /* Book[] books; */

    public static void main(String[] args) {

        Book onegin = new Book(); //сначала объявляем переменную онегин,
        // доступен ли нам класс Book и отводим в нем место для переменной онегин,
        // после этого мы говорим создать новый экземпляр класса book
        onegin.title = "Евгений Онегин";
        onegin.author = "А.С. Пушкин";
        onegin.language = "Russian";
        onegin.pages = 700;

        Book hrebtBezymia = new Book();
        hrebtBezymia.title = "Hrebti Bezymia";
        hrebtBezymia.author = "Lavkraft";
        hrebtBezymia.language = "Engliche";
        hrebtBezymia.pages = 300;

        Book lordOfTheRing = new Book();
        lordOfTheRing.title = "Властелин колец";
        lordOfTheRing.author = "R.R.Tolkin";
        lordOfTheRing.language = "Engliche";
        lordOfTheRing.pages = 900;

        Book gameOfTrons = new Book();
        gameOfTrons.title = "Игра престолов";
        gameOfTrons.author = "J.R.Martin";
        gameOfTrons.language = "Engliche";
        gameOfTrons.pages = 400;

        Book piknicNaObochine = new Book();
        piknicNaObochine.title = "Пикник на обочине";
        piknicNaObochine.author = "Strygatskiy";
        piknicNaObochine.language = "Engliche";
        piknicNaObochine.pages = 300;


        Book ivangoe = new Book();
        ivangoe.pages = 400;
        ivangoe.language = "Engliche";
        ivangoe.author = "W. Scott";
        ivangoe.title = "Ivanhoe";



        Book ajvengoe = Library.makeBook("Айвенгое", "В. Скотт", "Russian", 800);
        ajvengoe.original = ivangoe;

//        public : Данный метод может быть вызван из любого места.
//        static : Это ключевое слово указывает, что метод принадлежит классу, но не его объекту.
//        void : Это означает,что метод не возвращает значение, он выполняет определённое действие.

        Book gore = Library.makeBook("Горе от ума", "А.С. Грибоедов", "Russian", 1000);

        Book ktulhy = Library.makeBook("Ктулху", "Г.Ф.Лавкрфакт", "Engliche", 200);

        Book nochnoyDozor = Library.makeBook("Ночной Дозор", "Лукяненко", "Русский", 222);
        /*
        ТУТ МЫ ОБРАЩАЕМСЯ К КЛАССУ КОТОРЫЙ ЗАПУСКАЕТ МЕТОД И СОЗДАЕТ ПЕРЕМЕННУЮ КНИГИ НОЧНОГО ДОЗОРА
         А УЖЕ НИЖЕ МЫ ДЕЛАЕМ ПО ДРУГОМУ
        МЫ СОЗДАЕМ ЭКЗЕМПЛЯР БИБЛИОТЕКИ КОНГРЕССА, ПОТОМ ОТВОДИМ ЕЙ ПАМЯТЬ И ПЕРЕДАЕМ ЕЙ ПЕРЕМЕННЫЕ,
         И ПОСЛЕ ОБРАOАЕМСЯ ЭКЗЕМПЛЯРОМ КОНГРЕССА К МЕТОДУ
        */

        Library libraryOfCongress = new Library();
        libraryOfCongress.books = new Book[]{hrebtBezymia, ktulhy, nochnoyDozor, lordOfTheRing, piknicNaObochine, gore, ktulhy, nochnoyDozor};
        libraryOfCongress.printIndexCards();
        /* тут говорится - взять инстанс переменной library и в нем запустить эту функцию */
        System.out.println(Library.indexCardHeader);

/*
 тут создали массив с переменными типа ссылка на объект. Обычно раньше мы создавали массив со значениями чисел

        for (Book book : books) {
// здесь мы говорим перебрать все переменный массив book и каждый раз присваивать ее переменные к переменной books. Это сокращенная форма записи которая тоже работает.
            System.out.println(book.makeCard());
            System.out.println("--------------");
        }
    static Book newBook(String title, String author, String language, Integer pages) {
//здесь мы написали метод создающий и возвращающий новую книгу
// тод создает новую книгу, и после turn вернет нам новую книгу
// теперь можем одним методом создавать книги
        Book book = new Book();
        book.author = author;
        book.title = title;
        book.language = language;
        book.pages = pages;
        return book;
}
*/

        Library schollLibrary = new Library();
        schollLibrary.books = new Book[]{onegin,gore,ktulhy,nochnoyDozor};
        schollLibrary.printIndexCards();
        Library.indexCardHeader = "-------------КНИГА------------";
    }
}