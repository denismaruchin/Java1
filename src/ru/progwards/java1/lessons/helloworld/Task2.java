package ru.progwards.java1.lessons.helloworld;

public class Task2 {
    static void println(String str) {
        System.out.println(str);
    }
    public static int subtraction(int x, int y) {
        int z = x - y;
        return z;
    }
    public static void main(String [] args) {
        System.out.println("Вызвана функция subtraction() с параметрами x = 89, y = 55");
        System.out.print("Результат z = ");
        int z = subtraction(89, 55);
        System.out.println(z);
    }
}
