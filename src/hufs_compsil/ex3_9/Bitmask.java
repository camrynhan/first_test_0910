package hufs_compsil.ex3_9;

public class Bitmask {
    public static void main(String[] args) {
        int plus = 1, minus = -1;
        System.out.format("%d의 이진수: %s %n", plus, Integer.toBinaryString(plus));
        System.out.format("%d의 이진수: %s %n", minus, Integer.toBinaryString(minus));
        System.out.format("%d의 이진수: %s %n", ~plus + 1, Integer.toBinaryString(minus));

        int x = 287956;
        System.out.format("%d의 이진수: %s %n", x, Integer.toBinaryString(x));
        int num = 4;                //4번째 비트 값을 알아내기
        int mask = 1 << num-1;      //4번째 비트만 1인 mask 지정
        System.out.format("%d의 오른쪽에서 %d번째 비트 값: ", x, num);
        System.out.format("%d %n", ((x & mask) == 0) ? 0 : 1);
    }
}
