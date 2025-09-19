import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1. Khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);

        // 2. Yêu cầu người dùng nhập ký tự
        System.out.print("Nhập một ký tự thường (từ 'a' đến 'y'): ");

        // 3. Đọc ký tự đầu tiên từ chuỗi người dùng nhập
        char kyTu = scanner.nextLine().charAt(0);

        // 4. Kiểm tra ký tự nhập vào có hợp lệ không
        if (kyTu >= 'a' && kyTu < 'z') {
            // 5. Tìm và in ra ký tự liền sau
            char kyTuTiepTheo = (char) (kyTu + 1);
            System.out.println("Ký tự liền sau là: " + kyTuTiepTheo);
        } else {
            // 6. Thông báo lỗi nếu ký tự không hợp lệ
            System.out.println("Lỗi: Vui lòng nhập một ký tự thường từ 'a' đến 'y'.");
        }

        // 7. Đóng đối tượng Scanner
        scanner.close();
    }
}