class Dynamic_Method_Dispatch {

    public static void main(String[] args) {

        // A is the referance and B is the Implementation.
        A obj1 = new B(); // runtime ploymorphism .
        obj1.show();

        obj1=new C();
        obj1.show(); // Dynamic method dispatch!

    }

}

class A {
    public void show() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B show");
    }
}

class C extends A {
    public void show() {
        System.out.println("In C show");
    }
}