package homework12;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Olga ", "Primachenko ");
        Author author2 = new Author("Vladimir ", "Dmitrenko ");
        Book book1 = new Book("Love Yourself Tender", author1, 2022);
        Book book2 = new Book("History Of Fatherland", author2, 1995);
        printBook(book1);
        printBook(book2);


        book1.setYearOfPublication(2023);
        printBook(book1);
    }

    private static void printBook(Book book) {
        System.out.println(book.getBookTitle() + " " + book.getYearOfPublication()
                + " " + book.getAuthor().getAuthorName() + book.getAuthor().getAuthorSurname());

    }
}


