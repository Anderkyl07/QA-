import java.security.AllPermission;
import java.util.Arrays;

public class LibraryGames {

Game[] games;

    public static void main(String[] args) {
        //класс мейн мы используем для содержания программы и больше ничего, метод мейн класса мейн мы
        // использовали как место где писать нашу программу, где описаны операторы нашей программы,
        // так же как здесь класс Library библиотеки работы с классом Game игр.

        Game witcher1 = new Game(); // сначала объявляем переменную Witcher,
        // потом мы говорим создать новый экземпляр класса game под названием witcher.
        witcher1.title = "Wither 1";
        witcher1.janre = "RPG";
        witcher1.reyting = "18+";
        witcher1.cooperatif = false;
        witcher1.platforma = "PC, XboX, PS, Nintendo";
        witcher1.wremiaIgri = 200;
        witcher1.DLS = true;

        Game witcher2 = new Game();
        witcher2.title = "Wither 2";
        witcher2.janre = "RPG";


        Game witcher3 = new Game();
        witcher3.title = "Witcher3";
        witcher3.janre = "RPG";
        witcher3.DLS = true;
        witcher3.wremiaIgri = 1100;


        Game newerWinterNight = new Game();
        newerWinterNight.title = "Newerwinter Night";
        newerWinterNight.janre = "RPG";


        Game darkSouls = new Game();
        darkSouls.title = "Dark Souls";
        darkSouls.janre = "soulslika";

        Game darkSouls2 = new Game();
        darkSouls2.title = "Dark Souls 2";
        darkSouls2.janre = "souslslika";


        Game darkSouls3 = new Game();
        darkSouls3.title = "Dark Souls 3";
        darkSouls3.janre = "soulslika";

        Game baldurGate1 = new Game();
        baldurGate1.title = "Baldurs Gate 1";


        Game baldursGate2 = new Game();
        baldursGate2.title = "Baldurs Gate 2";
        baldursGate2.janre = "RPG";

        Game baldursGate3 = new Game();
        baldursGate3.title = "Baldurs Gate 3";
        baldursGate3.janre = "RPG";

        Game metro2032 = new Game();
        metro2032.title = "Metro2032";
        metro2032.janre = "RPG";

        Game GoodOfWar = Game.newGame("GodOfWar", "Slecher","18+","PC,PS", true,5,true);

        System.out.println(metro2032.title);
        System.out.println(darkSouls.title);
        System.out.println(baldursGate3.janre);


        Game[] games = {witcher3, witcher2, witcher1, darkSouls2, darkSouls3, darkSouls, baldursGate2, baldurGate1, baldursGate3, metro2032,GoodOfWar};
// массиву все равно какие элементы в него мы кладем, главное что бы эти элементы были одного типа данных.
        // в данные момент мы положили все ссылки типа game в массив
        System.out.println(games[0].title);
        System.out.println(games[1].title);
        System.out.println(games[2].title);
        System.out.println(games[3].title);
        System.out.println(games[4].title);
        System.out.println(games[5].title);


        System.out.println(games[6]);


        for (int i = 0; i < games.length; i++) {
            System.out.println(games[i]);
            System.out.println("---------------------------------------");
        }
//Заметим: цикл for-each нельзя применять напрямую к объекту String , так как он не является
// массивом или реализацией интерфейса Iterable.
        for (Game game : games) { // здесь мы говорим перебрать все переменный массив games и каждый
            // раз присваивать ее переменные к переменной game. Это сокращенная форма записи которая
            // тоже работает.

            System.out.println(game.makeCard());
            System.out.println("---------------------------------------");

            System.out.println(games[6].title);


        }
    }

//    static Game newGame(String title, String janre, String reyting, String platforma, Boolean cooperatif, Integer wremiaIgri, Boolean DLS) {
//        Game game = new Game();// сначала объявляем переменную game,
//        // потом мы говорим создать новый экземпляр класса game под названием game в классе Game.
//        game.title = title;
//        game.janre = janre;
//        game.reyting = reyting;
//        game.platforma = platforma;
//        game.cooperatif = cooperatif;
//        game.wremiaIgri = wremiaIgri;
//        game.DLS = DLS;
//        return game;
////        return null;
//    }


}
