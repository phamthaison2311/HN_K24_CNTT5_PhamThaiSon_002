import java.util.Scanner;

public class HN_K24_CNTT5_002_C3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Câu 3: Tư duy thuật toán nâng cao
        // Tìm giao của 2 mảng
        System.out.printf("Nhập số lượng phần tử mảng A: ");
        int n = sc.nextInt();
        int[] arrA = new int[n];

        for (int i = 0; i < n; i++) {
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
        for (int i = 0; i < n; i++) {
            boolean daXuatHien = false;
            for (int k = 0; k < i; k++) {
                if (arrA[k] == arrA[i]) {
                    daXuatHien = true;
                    break;
                }
            }

            if (!daXuatHien) {
                for (int j = 0; j < m; j++) {
                    if (arrA[i] == arrB[j]) {
                        System.out.printf("%d ", arrA[i]);
                        break;
                    }
                }
            }
        }

        System.out.println();
        int maxLanXuatHien = 0;
        int giaTriPhanTu = arrA[0];

        for (int i = 0; i < n; i++) {
            int dem = 0;
            for (int j = 0; j < n; j++) {
                if (arrA[i] == arrA[j]) {
                    dem++;
                }
            }
            if (dem > maxLanXuatHien) {
                maxLanXuatHien = dem;
                giaTriPhanTu = arrA[i];
            }
        }
        System.out.printf("Phần tử xuất hiện nhiều nhất trong mảng A là %d với %d lần.", giaTriPhanTu, maxLanXuatHien);
    }
}