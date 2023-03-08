package MD3_BaiThucHanh;

import java.util.Scanner;

public class BTH1 {
    public static void main(String[] args) {
        // write your code here
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập Một Kích Thước: ");
            size = scanner.nextInt();
            if (size > 20) System.out.println("Kích thước không vượt quá 20: ");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter Elements in array " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.printf(array[j] + "\t");
        }
    }
}
