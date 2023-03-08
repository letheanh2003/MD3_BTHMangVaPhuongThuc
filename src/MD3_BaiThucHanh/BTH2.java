package MD3_BaiThucHanh;

import java.util.Scanner;

public class BTH2 {
    public static void main(String[] args) {
        // write your code here
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Tên Học Sinh : ");
        String nameStudent = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(nameStudent)) {
                System.out.println("Vị Trí Của Học Sinh Trong Danh Sách " + nameStudent + " is " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + nameStudent + " in the list");
        }
    }
}
