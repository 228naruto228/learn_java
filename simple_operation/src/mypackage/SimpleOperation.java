package mypackage;

public class SimpleOperation {
    public static void main(String[] args) {

        int a = 13;
        int b = 5;
        System.out.println(a / b);  // результат целое число, чтобы было с остатком надо числа с плавающей точкой.
        System.out.println(a % 5);  // остаток от деления

        System.out.println();
        System.out.println(a > 5);
        System.out.println(a < 5);
        System.out.println(a >= 5);
        System.out.println(a <= 5);
        System.out.println(a == b);
        System.out.println(a != b);

        int i = 0;
        i++; // i = i + 1
        System.out.println(i);
        i--; // i = i - 1
        System.out.println(i);

        // || - ИЛИ
        // && - И   ВАЖНЕЕ ЧЕМ ИЛИ

        a += 5; // a = a + 5
        a -= 5; // a = a - 5
        a *= 5; // a = a * 5
        a /= 5; // a = a / 5


        System.out.println((a % 2 == 0) ? "Even" : "Odd"); 
    }
}
