public class PhepToanNhanChia {

    public static double nhan(double a, double b) {
        return a * b;
    }

    // Hàm chia có xử lý ngoại lệ chia cho 0
    public static double chia(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Lỗi: Không thể chia cho 0!");
        }
        return a / b;
    }

    // Hàm main để người 2 tự test độc lập
    public static void main(String[] args) {
        System.out.println("--- TEST: NHÂN / CHIA ---");
        System.out.println("5 * 3 = " + nhan(5, 3));
        
        try {
            System.out.println("10 / 2 = " + chia(10, 2));
            System.out.println("5 / 0 = " + chia(5, 0)); // Sẽ nhảy vào catch
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}