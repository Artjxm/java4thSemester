package pr6.builder;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book.Bookshelf("Thriller").yearOfPublication(1992).
                author("Stephen King").pageAmount(356).getBook();
        System.out.println(book1);

        System.out.println();

        Book book2 = new Book.Bookshelf("Child literature").yearOfPublication(1943).
                author("Antoine de Saint-Exupery").pageAmount(98).getBook();
        System.out.println(book2);
    }
}
