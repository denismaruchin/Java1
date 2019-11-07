package ru.progwards.java1.lessons.helloworld;

public class Task3 {

   public static int addition(int x, int y) {
       return x + y;
   }
   public static int subtraction(int x, int y) {
       return x - y;

   }
    public static int multiplication(int x, int y) {
        return x * y;
    }
    public static void main(String [] args) {
       System.out.println("Вызвана функция addition()");
       System.out.println("Вызвана функция subtraction()");
       System.out.println("Вызвана функция multiplication()");
       int a;
       int b;
       int c;
       a = 34;
       b = 55;
       System.out.print("a = ");
       System.out.println(a);
       System.out.print("b = ");
       System.out.println(b);
       int x = a;
       int y = b;
       c = addition(x,y);
       System.out.print("a + b = ");
       System.out.println(c);
       c = subtraction(x,y);
       System.out.print("a - b = ");
       System.out.println(c);
       c = multiplication(x,y);
       System.out.print("a * b = ");
       System.out.println(c);
    }
}
