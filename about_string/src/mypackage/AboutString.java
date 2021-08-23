package mypackage;

import java.util.Locale;

public class AboutString {
    public static void main(String[] args) {

        String s1 = "Hello world!";
        String s2 = "Hello";
        String s3 = "HELLO";
        System.out.println(s1.equals(s2));              //Сравнение строк
        System.out.println(s1.equals("Hello world!"));  //Сравнение строк
        System.out.println(s2.equalsIgnoreCase(s3));    //Сравнение строк несмотря на регистр

        String s4 = "TeXt";
        System.out.println();
        System.out.println(s4);
        System.out.println(s4.toLowerCase());           //Преобразование регистра строки
        System.out.println(s4.toUpperCase());

        System.out.println();
        System.out.println(s1.charAt(0));               //Узнать какой элемент находится по индексу
        System.out.println(s1.indexOf("wor"));          //Узнать какой элемент находится по индексу

        System.out.println();
        System.out.println(s1.contains("world"));       //Узнать содержит ли строка s1 подстроку world

        System.out.println(s1.length());                //Длина строки

        System.out.println();
        System.out.println(s1.startsWith("Hello"));     //Узнать начинается ли строка s1 с подстроки Hello
        System.out.println(s1.startsWith("!"));
        System.out.println(s1.endsWith("!"));           //Узнать, заканчивается ли строка s1 подстрокой !

    }
}
