import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập bán kính hình tròn
        System.out.print("Nhập bán kính hình tròn: ");
        double r = sc.nextDouble();

        // Tính chu vi và diện tích
        double chuVi = 2 * Math.PI * r;
        double dienTich = Math.PI * r * r;

        // In kết quả
        System.out.println("Chu vi hình tròn: " + chuVi);
        System.out.println("Diện tích hình tròn: " + dienTich);
    }
}
