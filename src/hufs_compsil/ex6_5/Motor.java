package hufs_compsil.ex6_5;

public class Motor extends Vehicle {
    public String name = "자동차"; //이름
    public int displacement;      //배기량

    public Motor() {
        super();   //생략 가능
    }

    public Motor(double maxSpeed, int seater, int displacement) {
    super(maxSpeed, seater);
    //this.maxSpeed = maxSpeed;
    //this.seater seater;
    this.displacement = displacement;
}

    public void printInfo() {
        System.out.print(super.name + ": " + this.name);
        System.out.print(", 최대속도: " + maxSpeed + "km");
        System.out.print("정원: " + seater + "명");
        System.out.println(", 배기량: " + displacement + "cc");
    }

    public static void main(String[] args) {
        Motor myCar = nwe Motor(300, 4, 5000);
        myCar.printInfo();
    }
}