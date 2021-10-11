package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Mark", "Mark2003@gmail.com",'M');
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());

        a1.setEmail("Marco@mail.ru");

        System.out.println(a1);
    }
}