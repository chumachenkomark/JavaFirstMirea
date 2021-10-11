package ru.mirea.task2;

public class BookTest
{
    public static void main(String[] args)
    {
        Book b1 = new Book("Bill Brayson", 856);
        Book b2 = new Book(344);
        Book b3 = new Book("Ten dark");
        b2.setName("Ben Frank");
        b3.setPages(469);
        System.out.println(b1);
        b1.toString();
        b2.toString();
        b3.toString();
    }
}
