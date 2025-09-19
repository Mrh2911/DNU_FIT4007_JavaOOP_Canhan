import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Nhập hai số nguyên từ người dùng
        System.out.print("Nhập giá trị của a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập giá trị của b: ");
        int b = scanner.nextInt();

        System.out.println("--- Trước khi hoán đổi ---");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 1. Khai báo biến trung gian và gán giá trị của a vào đó
        int temp = a;

        // 2. Gán giá trị của b cho a
        a = b;

        // 3. Gán giá trị đã lưu trong biến trung gian (giá trị ban đầu của a) cho b
        b = temp;

        System.out.println("--- Sau khi hoán đổi ---");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        scanner.close();
    }
}