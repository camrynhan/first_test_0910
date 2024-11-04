package hufs_compsil.ex2_8;

public class HelloStdIO {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("정수와 실수를 각각 입력하시오: ");
        int i = input.nextInt();
        double d = input.nextDouble();
        System.out.println("i = " + i + ", d = " + d);
        System.err.println("에러 노노");
    }
}
