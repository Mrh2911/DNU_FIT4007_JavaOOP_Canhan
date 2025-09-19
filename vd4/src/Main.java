import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập 3 cạnh tam giác
        System.out.print("Nhập cạnh a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = sc.nextDouble();

        // Tính chu vi
        double chuVi = a + b + c;

        // Tính nửa chu vi
        double p = chuVi / 2;

        // Tính diện tích theo công thức Heron
        double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        // In kết quả
        System.out.println("Chu vi tam giác: " + chuVi);
        System.out.println("Diện tích tam giác: " + dienTich);
    }
}
