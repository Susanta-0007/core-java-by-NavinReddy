public class FinalVariable {

    // final-> variable,class,method

    public static void main(String[] args) {

        // final variable :
        final int a = 5;
        a = 8;

    }

}

// final class : can't extends

final class Calculator {
    public void show() {
        System.out.println("Calculator");
    }
}

class AdvanceCalcuator extends Calculator {
    public void show() {
        System.out.println("Advance Calculator");
    }
}

// final method :

class Calculator {
    final public void show() {
        System.out.println("Calculator");
    }
}

class AdvanceCalcuator extends Calculator {
    public void show() {
        System.out.println("Advance Calculator");
    }
}
