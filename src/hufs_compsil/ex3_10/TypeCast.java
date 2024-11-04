package hufs_compsil.ex3_10;

public class TypeCast {
    public static void main(String[] args) {
        byte bt = (byte) -129;
        System.out.format("%d의 이진수: %s %n", -129, Integer.toBinaryString(-129));
        System.out.format("%d의 이진수: %s %n", bt, Integer.toBinaryString(bt));

        //int n = 5.0 / 4.0 ->오류발생
        int n = (int) (5.0 / 4.0);
        System.out.println(n);            //1
        System.out.println(3 / 4);        //0
        System.out.println(3 / 4.0);      //0.75

        double d = 3 + 4*2;               //int형 -> double형으로 자동 변환되어 저장
        System.out.println(d);            //double형 11.0
    }
}
