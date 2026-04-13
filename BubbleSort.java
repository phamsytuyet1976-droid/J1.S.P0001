/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author -MSI-
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        // 1. Nhập số lượng (viết gọn)
        System.out.print("Enter number of array: ");
        int n = sc.nextInt(); 
        
        // 2. Tạo mảng và random giá trị
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = rd.nextInt(100);

        // 3. In mảng lúc chưa sắp xếp
        System.out.println("Unsorted array: " + Arrays.toString(a));

        // 4. Thuật toán Bubble Sort tối giản
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // 5. In kết quả cuối cùng
        System.out.println("Sorted array: " + Arrays.toString(a));
    }
}
