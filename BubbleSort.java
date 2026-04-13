import java.util.*;

public class Main {
    // Hàm nhập số nguyên dương (để thỏa mãn yêu cầu số 1 của đề)
    public static int checkInput() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine().trim());
                if (n > 0) return n;
                System.out.print("Please enter a positive number: ");
            } catch (NumberFormatException e) {
                System.out.print("Invalid input, please enter a number: ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number of array: ");
        int n = checkInput(); // Dùng hàm check để không bị crash

        int[] a = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(100);
        }

        System.out.println("Unsorted array: " + Arrays.toString(a));

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(a));
    }
}
