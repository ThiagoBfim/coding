package codewar.kyu.six;

public class HowManyPagesInABook {

    public static int amountOfPages(int summary) {
        var pages = new StringBuilder();
        var page = 0;
        while (pages.length() < summary) {
            page++;
            pages.append(page);
        }
        return page;
    }


}
