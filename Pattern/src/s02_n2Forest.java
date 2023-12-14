/*
output :
*
* *
* * *
*/

public class s02_n2Forest {

    public static void main(String[] args) {
        int loop = 3;
        for (int i = 0; i < loop; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
