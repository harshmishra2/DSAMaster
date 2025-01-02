class Parent{

    //method overloading or compile time polymorphism

    public void func(){
        System.out.println("Parent method func");
    }
    public void func(int a){
        System.out.println("Parent method func with param = "+a);
    }
}

class Child extends Parent{

    //method overriding or run time polymorphism

    @Override
    public void func(int a){
        System.out.println("Child method function with parameter "+a);
    }

}

public class Polymorphism{
    public static void main(String[] args){

        Parent par = new Parent();
        Child chill = new Child();

        par.func();
        par.func(05);

        chil.func();
        chil.func(10);
    }

}