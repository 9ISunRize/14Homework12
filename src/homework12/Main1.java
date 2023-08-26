package homework12;

public class Main1 {
    public static void printAuthor (Author author) {
        System.out.println(author.getAuthorName() + author.getAuthorSurname());
    }

    public static void main(String[] args) {
        Author author1 = new Author("Olga ","Primachenko ");
        Author author2 = new Author("Vladimir ","Dmitrenko ");
        Book book1 = new Book ("Love Yourself Tender",author1 , 2023);
        Book book2 = new Book ("History Of Fatherland", author2, 1995);
        System.out.println(book1);
        System.out.println(book2);

book1.setYearOfPublication(2022);
        System.out.println(book1);

    }

}
