// 1 2 3 4 5 6 7 8 9 
// 1 2 3 4 5 6 7
// 1 2 3 4 5
// 1 2 3
// 1

public class Rev_Odd_seriesNum {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
