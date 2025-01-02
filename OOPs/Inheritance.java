class Parent{

    public void whereAbout(){
        System.out.println("This function is native to the parent class.");
    }
    
}

class Child extends Parent{
    public void haveInherited(){
        System.out.println("Yes currently inside Child class, which is inheriting from parent class.");
    }
}

public class Inheritance{
    public static void main(String[] args){
        
        Parent par = new Parent();
        Child chill = new Child();

        par.whereAbout();
        chill.whereAbout();
        chill.haveInherited();


    }
}