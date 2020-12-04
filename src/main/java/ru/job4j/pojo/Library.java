package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book("Clean code", 100088);
        Book book2 = new Book("Sherlock Holmes", 50000);
        Book book3 = new Book("Robinson Crusoe", 609000);
        Book book4 = new Book("Seven days", 503500);
        Book[] libr = new Book[4];
        libr[0] = book1;
        libr[1] = book2;
        libr[2] = book3;
        libr[3] = book4;

        for (int i = 0; i < libr.length; i++) {
            Book lib = libr[i];
            System.out.println("Book title : " + lib.getName() + ", " + "number of pages : " + lib.getPageCount());
        }
        System.out.println();
        Book tmp = libr[0];
        libr[0] = libr[3];
        libr[3] = tmp;

        for (Book el : libr) {
            System.out.println("Book title : " + el.getName() + ", " + "number of pages : " + el.getPageCount());
        }
        System.out.println();
        for (Book el : libr) {
            if (el.getName().equals("Clean code")) {
                System.out.println(el.getName());
            }
        }
    }
}

