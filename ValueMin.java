package BT_TimGiaTriNhoNhatTrongMang;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ValueMin {
    public static void main(String[] args) {
        // khai báo 1 mảng số nguyên có Size Phần Tử
        int size;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập Độ Dài Của Mảng Mà Bạn Muốn");
        size = scanner.nextInt();
        Integer[] array = new Integer[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        System.out.println("Mảng arr: " + Arrays.toString(array));
        System.out.println("Giá Trị Nhỏ Nhất Trong Mảng Là: " + ValueMin(array));
        //sắp Xếp Arrays.sort từ nhở đến Lớn
        Arrays.sort(array);
        System.out.println("Sắp Xếp Từ Nhở Đến Lớn : "+Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Sắp Xếp Từ Lớn Đến Nhỏ : "+Arrays.toString(array));
    }

    public static Integer ValueMin(Integer[] arr) {
        Integer min = arr[0];
        Integer index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index=i;
            }
        }
        System.out.println("Chỉ Số : "+index);
        return min;
    }
}
