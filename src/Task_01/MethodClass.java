package Task_01;

public class MethodClass {

    public void methodA (int a){
        System.out.print("J");
        if (a < 10){
            System.out.print("a");
        } else {
            System.out.println("Number too high!");
        }
        System.out.print("v");
        System.out.print("a");
        methodB();
    }

    public void methodB (){
        System.out.print(" er");
        methodC();
    }

    public void methodC (){
        System.out.print(" sjovt");
        methodD();
    }

    public void methodD (){
        System.out.println("!");
    }
}