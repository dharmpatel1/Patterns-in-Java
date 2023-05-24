public class Kite {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            if (i == 2 || i == 3 || i == 4 || i == 5) {
                for (int j = 2; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            if (i == 4 || i == 2 || i == 3) {
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
