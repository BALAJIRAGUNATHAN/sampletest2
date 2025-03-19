package DSA;

class A{
    public void show(){
        System.out.println("Test");
        System.out.println("test 2");
        System.out.println("test 2");
    }

}
class B extends A{
    public void show(){
        System.out.println("Test");
    }
}

class Main {
    public static void main(String[] args) {
        B obj=new B();
        obj.show();

    }
}
