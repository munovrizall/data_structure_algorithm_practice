/*
output :
1 2 3
1 2
1
*/

public class s06_reverseNumberTriangle {

    public static void main(String[] args) {
        int loop = 3;

        for (int i = 0; i < loop; i++) {
            for (int j = loop; j > i; j--) {
                System.out.print(loop - j + 1 + " ");
            }
            System.out.println();
        }
    }
}
