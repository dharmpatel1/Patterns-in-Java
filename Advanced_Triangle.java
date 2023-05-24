//         1 
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5

public class Advanced_Triangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
                // System.out.println();
            }
            if (i == 2) {
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
