public class Game {

    String title;
    String janre;  //это внутренние переменные класса, которые называются полями
    String reyting;
    String platforma;
    Boolean cooperatif;
    Integer wremiaIgri;
    Boolean DLS;


    public String makeCard(){
        return title + "\n" + janre +"\n" + reyting +"\n" + platforma +"\n" + cooperatif +"\n" + wremiaIgri +"\n" + DLS;
//return специальная операция которая прекращает выполнение функции, и возвращает тип данных.
// если ретерн возвращает тип данных не соответствующий данным принимающих в методе, он не сработает.
    }
    static Game newGame(String title, String janre, String reyting, String platforma, Boolean cooperatif, Integer wremiaIgri, Boolean DLS) {
        Game game = new Game();// сначала объявляем переменную game,
        // потом мы говорим создать новый экземпляр класса game под названием game в классе Game.
        game.title = title;
        game.janre = janre;
        game.reyting = reyting;
        game.platforma = platforma;
        game.cooperatif = cooperatif;
        game.wremiaIgri = wremiaIgri;
        game.DLS = DLS;
        return game;
//        return null;
    }

}
// у класса могут быть поведения, которые записываются в какие-то методы