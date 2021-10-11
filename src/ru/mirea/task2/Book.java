package ru.mirea.task2;

public class Book
{
    private String name;
    private int pages;

    public Book(String n, int a) {
        name = n;
        pages = a;
    }

    public Book(String n) {
        name = n;
        pages = 0;
    }

    public Book(int a) {
        name = "";
        pages = a;
    }

    public Book() {
        name = "Red Hat";
        pages = 0;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public String toString() {
        return "name " + this.name + ", pages " + this.pages;
    }
}
