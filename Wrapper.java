// Java is not pure Object Oriented Language :
 

public class Wrapper {
    public static void main(String[] args) {
        int num=7;

        // Integer num1=new Integer(num)
        Integer num1=num; // autoboxing

        // int num2=num1.intValue();
        int num2=num1; // unboxing

        System.out.println(num);

        String str="12";
        int num3=Integer.parseInt(str);

        System.out.println(num2*2);

    }
}
