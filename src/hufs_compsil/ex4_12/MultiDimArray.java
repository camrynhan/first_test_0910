package hufs_compsil.ex4_12;

public class MultiDimArray {
    public static void main(String[] args){
        int mtrx[][];
        //int [][]mtrx, int []mtrx[] OK
        mtrx = new int[2][3];
        //int mtrx[][] = new int[2][3];

        mtrx[0][0] = 3; mtrx[0][1] = 5; mtrx[0][2] = 7;
        mtrx[1][0] = 7; mtrx[1][1] = 5; mtrx[1][2] = 9;

        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++)
                System.out.print(mtrx[i][j] + " ");
            System.out.println();
        }
    }
}