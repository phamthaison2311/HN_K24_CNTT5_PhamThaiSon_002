import java.util.Scanner;

public class HN_K24_CNTT5_002_C3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Câu 3: Tư duy thuật toán nâng cao
        // Tìm giao của 2 mảng
        System.out.printf("Nhập số lượng phần tử mảng A: ");
        int n1 = sc.nextInt();
        int[] arrA = new int[n1];

        for (int i = 0; i < n1; i++) {
            System.out.printf("A[%d]: ", i + 1);
            arrA[i] = sc.nextInt();
        }

        System.out.printf("Nhập số lượng phần tử mảng B: ");
        int m = sc.nextInt();
        int[] arrB = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.printf("B[%d]: ", i + 1);
            arrB[i] = sc.nextInt();
        }

        System.out.printf("Giao của hai mảng: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 1; j < m; j++) {
                if (arrA[i] == arrB[j]) {
                    System.out.printf("%d ", arrA[i]);
                    break;
                }
            }
        }
    }
}
