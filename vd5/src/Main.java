import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập tuổi sinh viên tính đến năm 2023
        System.out.print("Nhập tuổi sinh viên tính đến năm 2023: ");
        int tuoi = sc.nextInt();

        // Tính năm sinh
        int namSinh = 2023 - tuoi;

        // In kết quả
        System.out.println("Năm sinh của sinh viên là: " + namSinh);
    }
}
