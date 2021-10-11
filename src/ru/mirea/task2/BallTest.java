package ru.mirea.task2;
import java.lang.*;

public class BallTest
{
    public static void main(String[] args)
    {
        Ball b1 = new Ball("Blue", 7);
        Ball b2 = new Ball(6);
        Ball b3 = new Ball("Green");
        b2.setColor("Yellow");
        b3.setRadius(4);
        System.out.println(b1);
        b1.getS();
        b2.getS();
        b3.getS();
    }
}
