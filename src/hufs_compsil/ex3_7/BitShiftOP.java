package hufs_compsil.ex3_7;

public class BitShiftOP {
    public static void main(String[] args) {
        int x = -24, y = 3;
        System.out.format("%d(%s) >>> %d 결과 %d(%s) %n", x, Integer.toBinaryString(x),
        y, x>>>3, Integer.toBinaryString(x>>>3));
    }
}
