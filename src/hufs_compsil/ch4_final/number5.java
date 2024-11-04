package hufs_compsil.ch4_final;

public class number5 {
    public static void main(String[] args) {
        String name1[] = {"최", "김", "이" ,"박"};
        String name2[] = {"타", "스", "리", "잉안", "캐빈"};

        System.arraycopy(name1, 0, name2, 0, name1.length);
        for (String name : name2)
            System.out.print(name + " ");
        System.out.println();
        for (String name: name1)
            System.out.print(name + " ");
    }
}
