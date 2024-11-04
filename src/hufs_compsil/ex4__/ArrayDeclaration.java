package hufs_compsil.ex4__;

public class ArrayDeclaration {
    public static void main(String[] args) {
        //배열 선언과 생성을 분리
        int[] month;
        double[] values;

        //배열 생성
        month = new int[4];
        values = new double[3];
        System.out.println(month.length);
        System.out.println(values.length);

        //배열 선성과 생성을 하나의 문장으로
        char[] ch = new char[6];
        float[] data = new float[5];
        data = new float[7];  //다른 배열 객체를 생성하여 저장. 위의 길이 5인 배열은 앞으로 무시 ㅇㅇ
        System.out.println(ch.length);
        System.out.println(data.length);
    }
}
