package hufs_compsil.ex3_12;

public class DevideByZero {
    public static void main(String[] args) {
        short data1 = 32766;
        short data2 = 1;
        //short data = data1 + data2; ->오류 발생
        short data3 = (short) (data1 + data2);
        short data4 = 32766 + 1; //더한 결과가 short의 범주인 -3276~32767사이면 오류 발생 x
        System.out.println(data3 + " " + data4);

        System.out.println(0.0 / 0.0); //NaN
        System.out.println(3 / 0.0); //Infinity
        System.out.println(3 / 0); //ArithmeticException 예외발생

    }
}
