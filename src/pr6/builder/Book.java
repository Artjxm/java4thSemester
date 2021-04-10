package pr6.builder;

public class Book {
    private final String genre;
    private final int yearOfPublication;
    private final String author;
    private final int pageAmount;

    public static class Bookshelf {
        private String genre = "";
        private int yearOfPublication = 0;
        private String author = "";
        private int pageAmount = 0;

        public Bookshelf(String genre) {
            this.genre = genre;
        }

        public Bookshelf yearOfPublication(int date) {
            yearOfPublication = date;
            return this;
        }

        public Bookshelf author(String author) {
            this.author = author;
            return this;
        }

        public Bookshelf pageAmount(int pages) {
            pageAmount = pages;
            return this;
        }

        public Book getBook() {
            return new Book(this);
        }
    }

    private Book(Bookshelf type) {
        genre = type.genre;
        yearOfPublication = type.yearOfPublication;
        author = type.author;
        pageAmount = type.pageAmount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "genre='" + genre + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", author='" + author + '\'' +
                ", pageAmount=" + pageAmount +
                "}\n";
    }
}
