/*
output :
1
1 2
1 2 3
*/

public class s03_nTriangles {

    public static void main(String[] args) {
        int loop = 3;
        for (int i = 1; i <= loop; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
