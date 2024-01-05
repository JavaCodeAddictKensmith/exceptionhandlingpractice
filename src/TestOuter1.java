//RULES OF STATIC NESTED CLASS
//It can access static data members of the outer class, including private.
//The static nested class cannot access non-static (instance) data members or
class TestOuter1{
    static int data=30;
    static class Inner{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        TestOuter1.Inner obj=new TestOuter1.Inner();
        obj.msg();
    }
}