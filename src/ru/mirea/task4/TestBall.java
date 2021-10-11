package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(10, 20);
        Ball b2 = new Ball();

        System.out.println(b1.getX());
        System.out.println(b1.getY());

        b1.move(5, -6);

        System.out.println(b1);

        b2.setX(3);
        b2.setY(6);

        System.out.println(b2);
    }
}