import java.util.Scanner;

public class HN_K24_CNTT5_002_C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Câu 2: Kỹ thuật sử lý Mảng 1 chiều
        // Xóa phần tử theo vị trí
        System.out.printf("Số lượng phần tử: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d]: ", i + 1);
            arr[i] = sc.nextInt();
        }

        System.out.printf("Bạn muốn xóa phần tử vị trí: ");
        int index = sc.nextInt();
        for (int i = index - 1; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Sau khi xóa theo yêu cầu");
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("%d", arr[i]);
            if (i < n - 2) {
                System.out.printf(", ");
            }
        }
        System.out.println();

        // Tìm số còn thiếu

    }
}