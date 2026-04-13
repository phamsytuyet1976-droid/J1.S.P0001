import java.util.Scanner;
import java.util.Random; // Cần thêm cái này để tạo số ngẫu nhiên

public class BubbleSort {

    private static final Scanner in = new Scanner(System.in);

    // 1. Kiểm tra đầu vào số nguyên dương
    private static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result <= 0) throw new NumberFormatException(); // Bắt nhập số dương
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input a positive number");
                System.out.print("Enter again: ");
            }
        }
    }

    // 2. Nhập kích thước mảng
    private static int inputSizeOfArray() {
        System.out.println("Enter number of array:");
        return checkInputInt();
    }

    // 3. Tạo mảng ngẫu nhiên (Đúng yêu cầu đề bài)
    private static int[] generateRandomArray(int n) {
        int[] a = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            // Tạo số ngẫu nhiên từ -100 đến 100 (hoặc tùy bạn chọn)
            a[i] = rd.nextInt(200) - 100; 
        }
        return a;
    }

    // 4. Thuật toán Bubble Sort
    private static void sortArrayByBubbleSort(int[] a) {
        // In mảng chưa sắp xếp
        System.out.print("Unsorted array: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + (i == a.length - 1 ? "" : ", "));
        }
        System.out.println("]");

        // Thuật toán sắp xếp
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap trực tiếp ở đây
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    // 5. In mảng sau khi sắp xếp
    private static void print(int[] a) {
        System.out.print("Sorted array: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + (i == a.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int n = inputSizeOfArray();
        int[] a = generateRandomArray(n); // Đổi từ nhập tay sang random
        sortArrayByBubbleSort(a);
        print(a);
    }
}