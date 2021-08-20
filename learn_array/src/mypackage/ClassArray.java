package mypackage;

public class ClassArray {
    public static void main(String[] args) {

        // Инициализация массива
        String[] names;
        names = new String[3];
        int[] arr = new int[10]; //Пустой массив размером 10 элементов


        // Заполнение массива
        names[0] = "Vasya";
        names[1] = "Petya";
        names[2] = "Vanya";

        int[] array = {15, 10, 100, 9, 44};
        System.out.println(array[0]);

        for (int i = 0; i < 5; i++){
            System.out.println(i+1 + "й элемент массива array равен: " + array[i]);
        }


        //Методы массивов
        System.out.println(array.length);

    }
}
