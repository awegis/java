import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Привет, пользователь! Сколько чисел будет в массиве?");

        int size = x.nextInt();
        int[] arr = new int[size];
        int i = 0, sum = 0, max = -1000000000, min = 1000000000;

        while (i<size){
            System.out.println("Введите число в массив");
            int a = x.nextInt();
            arr[i] = a;
            System.out.println("Вы ввели число "+a);
            sum += arr[i];
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
            i++;
        }
        System.out.println("Сумма чисел, введенных тобой в массив, равна "+ sum + "\nМаксимальное число массива равно "+ max + "\nМинимальное число массива равно "+ min);

    }
}
