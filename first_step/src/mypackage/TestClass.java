package mypackage;

public class TestClass {

    public static void main(String[] args) {
        System.out.println("Hello word!");
        System.out.println("It's my first program in Java!");

        byte a = 5; //-128 127
        short b = -100; //-32768 32767
        int c = 1000000;
        long d = 1234565444;

        System.out.println(a);
        System.out.println("short b: " + b);

        double double1 = 133.155;
        System.out.println("double double1: " + double1);
        float float1 = 150.32f;
        System.out.println(float1);

        boolean boolean1 = true;
        boolean boolean2 = false;
        boolean boolean3 = 1 + 2 > 0;

        String str = "Hello";
        String str2 = "World!";
        System.out.println(str + " " + str2);

        char char1 = 'q';
        System.out.println(char1);

    }
}
