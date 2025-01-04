public class UpAndDownCasting {

    public static void main(String[] args) {
        // typecasting
        double a = 5;
        int res = (int) a;

        // upcasting
        A obj = (A) new B();
        obj.show1();

        B obj1 = (B) obj;
        obj1.show2();
    }
}

class A {
    void show1() {
        System.out.println("In A show");
    }
}

class B extends A {
    void show2() {
        System.out.println("In B show");
    }
}