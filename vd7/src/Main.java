import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên N (có ít nhất 2 chữ số)
        System.out.print("Nhập số nguyên N (ít nhất 2 chữ số): ");
        int N = sc.nextInt();

        // Lấy giá trị tuyệt đối của N để xử lý số âm
        int absN = Math.abs(N);

        // Lấy chữ số gần cuối: chia lấy dư 100 rồi chia lấy phần nguyên cho 10
        int chuSoGanCuoi = (absN / 10) % 10;

        // In kết quả
        System.out.println("Chữ số gần cuối của N là: " + chuSoGanCuoi);
    }
}
