import java.util.Scanner;

public class HN_K24_CNTT5_002_C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        // Câu 1: Xử lý chuỗi và dữ liệu văn bản
        // Chuẩn hóa tên
        System.out.printf("Nhập tên của bạn: ");
        name = sc.nextLine();

        name = name.trim();
        String ketQuaTen = "";
        if (name.length() > 0) {
            String[] cacTu = name.split(" ");
            for (int i = 0; i < cacTu.length; i++) {
                String tu = cacTu[i];
                if (tu.length() > 0) {
                    String chuDau = tu.substring(0, 1).toUpperCase();
                    String phanConLai = tu.substring(1).toLowerCase();
                    ketQuaTen += chuDau + phanConLai + " ";
                }
            }
            System.out.println("Tên sau khi chuẩn hóa: " + ketQuaTen.trim());
        }

        // Tìm ký tự không lặp lại đầu tiên
        String chuoiKyTu = "";
        System.out.printf("Nhập chuỗi bất kỳ: ");
        chuoiKyTu = sc.nextLine();

        for (int i = 0; i < chuoiKyTu.length(); i++) {
            char kyTuHienTai = chuoiKyTu.charAt(i);
            int dem = 0;

            for (int j = 0; j < chuoiKyTu.length(); j++) {
                if (chuoiKyTu.charAt(j) == kyTuHienTai) {
                    dem++;
                }
            }

            if (dem == 1) {
                System.out.println("Ký tự không lặp lại đầu tiên là: " + kyTuHienTai);
                break;
            }
        }
    }
}