package ru.mirea.task2;
import java.lang.*;

public class Ball
{
    private String color;
    private int radius;

    public Ball(String n, int a) {
        color = n;
        radius = a;
    }

    public Ball(String n) {
        color = n;
        radius = 0;
    }

    public Ball(int a) {
        color = "";
        radius = a;
    }

    public Ball() {
        color = "Red";
        radius = 0;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(String color) {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public String toString() {
        return "color " + this.color + ", radius " + this.radius;
    }

    public void getS() {
        System.out.println("S = " + 4 * 3.14f * (this.radius * this.radius));
    }
}