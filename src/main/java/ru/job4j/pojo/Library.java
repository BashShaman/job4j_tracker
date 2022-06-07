package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Clean Code", 464);
        books[1] = new Book("The Clean Coder", 256);
        books[2] = new Book("Clean Craftsmanship", 416);
        books[3] = new Book("Clean Architecture", 432);
        for (int i = 0; i < books.length; i++) {
            System.out.printf("Title: %s, number of pages: %d.\n",
                    books[i].getTitle(), books[i].getNumberOfPages());
        }
        System.out.println("-------------------------------------------------");
        Book tempBook = books[0];
        books[0] = books[3];
        books[3] = tempBook;
        for (Book book : books) {
            System.out.printf("Title: %s, number of pages: %d.\n",
                    book.getTitle(), book.getNumberOfPages());
        }
        System.out.println("-------------------------------------------------");
        for (Book book : books) {
            if (!book.getTitle().equals("Clean Code")) {
                continue;
            }
            System.out.printf("Title: %s, number of pages: %d.\n",
                    book.getTitle(), book.getNumberOfPages());
        }
    }
}
