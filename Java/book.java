public class book {
    String title;
    String author;
    String language;
    int pages;

book original;

    public String makeCard() {
        String originLine = original != null ? "\nTranslater from " + original.language : "";

        return title + "\n" + author + "\n" +
                language + ", " + pages + "pages" + originLine;


    }
}
