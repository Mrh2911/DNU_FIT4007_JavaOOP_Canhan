import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1. Khởi tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // 2. Yêu cầu người dùng nhập tên
        System.out.print("Mời bạn nhập tên của mình: ");

        // 3. Đọc chuỗi tên do người dùng nhập vào
        String ten = scanner.nextLine();

        // 4. Lấy độ dài của chuỗi tên
        int doDaiTen = ten.length();

        // 5. In kết quả ra màn hình
        System.out.println("Độ dài tên của bạn là: " + doDaiTen);

        // 6. Đóng đối tượng Scanner
        scanner.close();
    }
}