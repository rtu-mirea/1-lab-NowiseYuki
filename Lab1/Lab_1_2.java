package Lab1;

import javax.sound.midi.SysexMessage;
import java.util.Random;
import java.util.Scanner;

public class Lab_1_2 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int length = in.nextInt();
        ArraySlave slave = new ArraySlave(length);

        slave.randomFilling();

        int choose = 0;
        do {
            System.out.println("\n");
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
                    slave.showArray();
                    break;
                case 2:
                    System.out.println("Заполнение массива с клавиатуры...");
                    slave.keyboardFilling();
                    System.out.println("Массив заполнен");
                    break;
                case 3:
                    System.out.println("Автоматическое заполнение массива...");
                    slave.randomFilling();
                    System.out.println("Массив заполнен");
                    break;
                case 4:
                    System.out.println("Количество чисел массива принадлежащих заданному диапазону");
                    System.out.println("Введите диапазон. Начальное число и конечное");
                    int first = in.nextInt(),
                            last = in.nextInt();
                    System.out.println("Количество элементов в диапазоне [" + first + "-" + last + "] - " + slave.belongToRange(first, last));
                    break;
                case 5:
                    System.out.println("Сортировка массива выбором");
                    slave.sortStraight();
                    System.out.println("Соритровка выполнена");
            }
        } while (choose != 6);
        System.out.println("Выход из программы! Спасибо за использование!");
        in.close();

    }

}
