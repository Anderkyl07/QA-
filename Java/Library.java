public class Library {

    static Book[] books;

    public static void main (String[] args) {
        // тут мы создаем что-то по чертежу


        Book onegin = new Book();
        onegin.title = "Евгений Онегин";
        onegin.author = "А.С.Пушкин";
        onegin.language = "Russian";
        onegin.pages = 800;


Book ivangoe = new Book();
        ivangoe.title = "Ivangoe";
        ivangoe.author = "W. Scott";
        ivangoe.language = "Englich";
        ivangoe.pages = 500;


        Book [] books = {onegin,ivangoe};


        System.out.println(books[0].title);

for (Book book : books);{



        }
    }
}
