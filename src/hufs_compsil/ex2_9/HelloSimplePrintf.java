package hufs_compsil.ex2_9;

public class HelloSimplePrintf {
    public static void main(String[] args) {
        byte age = 27;
        int weight = 70;
        double height = 175.8;

        System.out.printf("나이: %d, 몸무게: %d, 키: %f, ", age, weight, height);
        System.out.printf("%s: %c 형", "혈액형", 'O');
    }
}