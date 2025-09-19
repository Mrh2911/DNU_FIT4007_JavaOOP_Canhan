import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên N
        System.out.print("Nhập số nguyên N: ");
        int N = sc.nextInt();

        // Lấy giá trị tuyệt đối của N để xử lý trường hợp N < 0
        int absN = Math.abs(N);

        // Lấy chữ số cuối cùng bằng phép chia lấy phần dư cho 10
        int chuSoCuoi = absN % 10;

        // In kết quả
        System.out.println("Chữ số cuối cùng của số " + N + " là: " + chuSoCuoi);
    }
}
