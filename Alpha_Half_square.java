// a 
// a b
// a b c
// a b c d
// a b c d e

public class Alpha_Half_square {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (96 + j) + " ");
            }
            System.out.println();
        }
    }
}

// a
// b b
// c c c
// d d d d
// e e e e e

// public class Alpha_Half_square {
// public static void main(String[] args) {
// for (int i = 1; i <= 5; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print((char) (96 + i) + " ");
// }
// System.out.println();
// }
// }
// }