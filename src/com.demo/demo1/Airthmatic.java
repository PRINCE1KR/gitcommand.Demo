package src.com.demo.demo1;

public class Airthmatic {
    public int add(int a,int b){
        return a+b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public int substract(int a,int b){
        return a-b;
    }
    public float division(int a,int b){
        return a/b;
    }


    public static void main(String[] args) {
        Airthmatic airthmatic = new Airthmatic();
        System.out.println("adding two number-"+airthmatic.add(  2, 3 ));
        System.out.println("multiply of two number-"+airthmatic.multiply(2,3));
        System.out.println("substract of two number-"+airthmatic.substract(4,3));
        System.out.println("division of two number-"+airthmatic.division(10,5));
    }
}
