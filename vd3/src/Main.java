import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double chieuDai = sc.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double chieuRong = sc.nextDouble();

        // Tính chu vi và diện tích
        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;

        // In kết quả
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
    }
}
