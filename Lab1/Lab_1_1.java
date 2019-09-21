package Lab1;

import java.util.Random;
import java.util.Scanner;

public class Lab_1_1 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int length = in.nextInt();
        int[] array = new int[length];

        randomFilling(array);

        System.out.println();
        int choose;

        do {
            System.out.println("\n\n");
            System.out.println("Выберите действие:");
            System.out.println("1 - Вывести массив");
            System.out.println("2 - Заполнить массив с клавиатуры");
            System.out.println("3 - Заполнить массив автоматически");
            System.out.println("4 - Найти количество чисел массива принадлежащих заданному диапазону");
            System.out.println("5 - Упорядочить элементы массива по возрастанию");
            System.out.println("6 - Выйти");

            choose = in.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Вывод массива...");
                    showArray(array);
                    break;
                case 2:
                    System.out.println("Заполнение массива с клавиатуры...");
                    keyboardFilling(array);
                    System.out.println("Массив заполнен");
                    break;
                case 3:
                    System.out.println("Автоматическое заполнение массива...");
                    randomFilling(array);
                    System.out.println("Массив заполнен");
                    break;
                case 4:
                    System.out.println("Количество чисел массива принадлежащих заданному диапазону");
                    System.out.println("Введите диапазон. Начальное число и конечное");
                    int first = in.nextInt(),
                            last = in.nextInt();
                    System.out.println("Количество элементов в диапазоне [" + first + "-" + last + "] - " + belongToRange(array, first, last));
                    break;
                case 5:
                    System.out.println("Сортировка массива выбором");
                    sortStraight(array);
                    System.out.println("Соритровка выполнена");
            }
        } while (choose != 6);
        System.out.println("Выход из программы! Спасибо за использование!");
        in.close();

    }

/*
1) Ввод с клавиатуры
2) Ввод с датчиком случайных чисел
3) Вывод массива

4) Метод 1 (Определить количество чисел массива принадлежащих заданному диапазону)
5) Метод 2 (Упорядочить элементы массива по возрастанию методом прямого выбора)
 */

    static int[] keyboardFilling(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();
        return arr;
    }

    static int[] randomFilling(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(10);
        return arr;
    }

    static void showArray(int[] arr) {
        for (int i: arr)
            System.out.print(i + " ");
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }

    static int belongToRange(int[] arr, int first, int last) {
        if (last < first || first == last)
            return -1;
        int counter = 0;
        for (int i = 0; i < arr.length; i++)
            if (first <= arr[i] && arr[i] <= last)
                counter++;
        return counter;
    }

    static int[] sortStraight(int[] arr) {
        for (int min = 0; min < arr.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[least];
            arr[least] = tmp;
        }

        return arr;
    }

}
