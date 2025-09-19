import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập 2 số nguyên a và b
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        // Tính tổng, hiệu, tích
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;

        // Tính thương dưới dạng số thực (float)
        float thuong = (float) a / b;

        // In kết quả
        System.out.println("Tổng: " + tong);
        System.out.println("Hiệu: " + hieu);
        System.out.println("Tích: " + tich);
        System.out.println("Thương: " + thuong);
    }
}
