package hufs_compsil.ex2_6;

public class HelloDefaultVaule {
    //필드 선언. 이때 static을 빼면 문법오류 발생
    static int def;
    static boolean bool;
    static String name;

    public static void main(String[] args) {
        //지역변수 선언
        int n = 100;
        System.out.println(n);

        //필드 사용 가능!
        System.out.println(def);
        System.out.println(bool);
        System.out.println(name);
    }
}