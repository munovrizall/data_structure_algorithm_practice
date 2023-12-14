/*
output :
1
2 2
3 3 3
*/

public class s04_Triangle {

    public static void main(String[] args) {
        int loop = 3;
        for (int i = 1; i <= loop; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
