//         1   
//       1   2
//     1   2   3
//   1   2   3   4
// 1   2   3   4   5

public class Number_Pyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "   ");
            }
            System.out.println();
        }
    }
}

// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

// public class Number_Pyramid {
// public static void main(String[] args) {
// for (int i = 5; i >= 1; i--) {
// for (int k = 1; k <= 5 - i; k++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// }
// }
// }
