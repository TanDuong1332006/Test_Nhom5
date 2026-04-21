public class PhuongTrinhBacNhat {
    
    // Hàm giải phương trình ax + b = 0
    public static String giaiPT(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                return "Phương trình có vô số nghiệm.";
            } else {
                return "Phương trình vô nghiệm.";
            }
        } else {
            double x = -b / a;
            return "Phương trình có nghiệm x = " + x;
        }
    }

    // Hàm main để người 1 tự test độc lập
    public static void main(String[] args) {
        System.out.println("--- TEST: GIẢI PT BẬC 1 ---");
        System.out.println("a=0, b=0 -> " + giaiPT(0, 0));
        System.out.println("a=2, b=-4 -> " + giaiPT(2, -4));
    }
}