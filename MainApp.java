import java.util.Scanner;

public class MainApp {

    // Chức năng Cộng Trừ do Người 3 tự làm
    public static double cong(double a, double b) {
        return a + b;
    }

    public static double tru(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========= MENU CHƯƠNG TRÌNH =========");
            System.out.println("1. Cộng / Trừ");
            System.out.println("2. Nhân / Chia");
            System.out.println("3. Giải phương trình bậc nhất (ax + b = 0)");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số a: "); double a1 = scanner.nextDouble();
                    System.out.print("Nhập số b: "); double b1 = scanner.nextDouble();
                    System.out.println("Kết quả Cộng: " + cong(a1, b1));
                    System.out.println("Kết quả Trừ: " + tru(a1, b1));
                    break;

                case 2:
                    System.out.print("Nhập số a: "); double a2 = scanner.nextDouble();
                    System.out.print("Nhập số b: "); double b2 = scanner.nextDouble();
                    
                    // Người 3 xóa 2 dấu "//" ở dưới để MERGE code của Người 2:
                    // System.out.println("Kết quả Nhân: " + PhepToanNhanChia.nhan(a2, b2));
                    // try {
                    //     System.out.println("Kết quả Chia: " + PhepToanNhanChia.chia(a2, b2));
                    // } catch (ArithmeticException e) {
                    //     System.out.println(e.getMessage());
                    // }
                    break;

                case 3:
                    System.out.print("Nhập hệ số a: "); double a3 = scanner.nextDouble();
                    System.out.print("Nhập hệ số b: "); double b3 = scanner.nextDouble();
                    
                    // Người 3 xóa dấu "//" ở dưới để MERGE code của Người 1:
                    // System.out.println("Kết quả: " + PhuongTrinhBacNhat.giaiPT(a3, b3));
                    break;

                case 0:
                    System.out.println("Đã thoát!");
                    break;
                default:
                    System.out.println("Chọn sai, vui lòng chọn lại.");
            }
        } while (choice != 0);

        scanner.close();
    }
}