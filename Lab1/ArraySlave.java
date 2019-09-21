package Lab1;

import java.util.Random;
import java.util.Scanner;

public class ArraySlave {

    private int length;
    private int array[];

    public ArraySlave(int length) {
        this.length = length;
        this.array = new int[length];
    }

/*
1) Ввод с клавиатуры
2) Ввод с датчиком случайных чисел
3) Вывод массива

4) Метод 1 (Определить количество чисел массива принадлежащих заданному диапазону)
5) Метод 2 (Упорядочить элементы массива по возрастанию методом прямого выбора)
 */

    public void keyboardFilling() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < this.length; i++)
            this.array[i] = in.nextInt();
    }

    public void randomFilling() {
        Random random = new Random();
        for (int i = 0; i < this.length; i++)
            this.array[i] = random.nextInt(10);
    }

    public void showArray() {
        for (int i: this.array)
            System.out.print(i + " ");
        System.out.println();
        for (int i = this.length - 1; i >= 0; i--)
            System.out.print(this.array[i] + " ");
    }

    public int belongToRange(int first, int last) {
        if (last < first || first == last)
            return -1;
        int counter = 0;
        for (int i = 0; i < this.length; i++)
            if (first <= this.array[i] && this.array[i] <= last)
                counter++;
        return counter;
    }

    public void sortStraight() {
        for (int min = 0; min < this.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < this.length; j++) {
                if (this.array[j] < this.array[least]) {
                    least = j;
                }
            }
            int tmp = this.array[min];
            this.array[min] = this.array[least];
            this.array[least] = tmp;
        }
    }


}
