/*
output :
* * *
* *
*
*/


public class s05_seeding {

    public static void main(String[] args) {
        int loop = 3;
        for (int i = loop; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
