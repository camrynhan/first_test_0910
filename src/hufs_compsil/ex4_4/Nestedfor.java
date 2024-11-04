package hufs_compsil.ex4_4;

public class Nestedfor {
    public static void main(String[] args) {
        int i, j;

        i = 2;
        while (i <= 9) {
            j = 1;
            while (j <= 5) {
                System.out.printf("%d*%d = %2d  ", i, j, i*j);
                j++;
                //i++; (x)
            }
            System.out.println();
            i++;
        }
    }
}
