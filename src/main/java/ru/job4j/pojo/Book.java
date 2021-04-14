package ru.job4j.pojo;

public class Book {
    private String name;
    private final int pageCount;

    public Book(String name,int pageCount){
        this.name = name;
        this.pageCount = pageCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

}
