// 1 2 
// 1 2 3 4
// 1 2 3 4 5 6
// 1 2 3 4 5 6 7 8
// 1 2 3 4 5 6 7 8 9 10

public class Even_seriesNum {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (2 * i); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
