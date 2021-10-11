package ru.mirea.task2;
import java.lang.*;

public class DogTest {
    public static void main(String[] args)
    {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog(7);
        Dog d3 = new Dog("Bob");
        d2.setName("Greg");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
